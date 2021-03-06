package com.liuurick.pay.service.impl;

import com.google.gson.Gson;
import com.liuurick.pay.dao.PayInfoMapper;
import com.liuurick.pay.enums.PayPlatformEnum;
import com.liuurick.pay.pojo.PayInfo;
import com.liuurick.pay.service.PayService;
import com.lly835.bestpay.enums.BestPayPlatformEnum;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.enums.OrderStatusEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.BestPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author liubin
 */
@Service
@Slf4j
public class PayServiceImpl implements PayService {

    @Autowired
    private BestPayService bestPayService;

    @Autowired
    private PayInfoMapper payInfoMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;

    private final static String QUEUE_PAY_NOTIFY = "payNotify";

    @Override
    public PayResponse create(String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum) {

        //插入数据库
        PayInfo payInfo = new PayInfo(Long.parseLong(orderId),
                PayPlatformEnum.getByBestPayTypeEnum(bestPayTypeEnum).getCode(),
                OrderStatusEnum.NOTPAY.name(),
                amount);
        payInfoMapper.insertSelective(payInfo);

        PayRequest payRequest = new PayRequest();
        payRequest.setOrderId(orderId);
        payRequest.setOrderAmount(amount.doubleValue());
        payRequest.setOrderName("测试支付功能");
        payRequest.setPayTypeEnum(bestPayTypeEnum);

        PayResponse payResponse = bestPayService.pay(payRequest);
        log.info("response={}",payResponse);

        return payResponse;
    }

    @Override
    public String asyncNotify(String notifyDate) {
        /**
         * 1.签名校验
         */
        PayResponse payResponse = bestPayService.asyncNotify(notifyDate);
        log.info("payResponse={}",payResponse);
        /**
         * 2.金额校验
         */
        PayInfo payInfo = payInfoMapper.selectByOrderNo(Long.parseLong(payResponse.getOrderId()));
        if (payInfo == null) {
            //告警
            throw new RuntimeException("通过orderNo查询到的结果是null");
        }


        /**
         * 3.修改订单支付状态
         */
        //如果订单支付状态不是"已支付"
        if (!payInfo.getPlatformStatus().equals(OrderStatusEnum.SUCCESS.name())) {
            //Double类型比较大小，精度。1.00  1.0
            if (payInfo.getPayAmount().compareTo(BigDecimal.valueOf(payResponse.getOrderAmount())) != 0) {
                //告警
                throw new RuntimeException("异步通知中的金额和数据库里的不一致，orderNo=" + payResponse.getOrderId());
            }

            //3. 修改订单支付状态
            payInfo.setPlatformStatus(OrderStatusEnum.SUCCESS.name());
            payInfo.setPlatformNumber(payResponse.getOutTradeNo());

            payInfoMapper.updateByPrimaryKeySelective(payInfo);
        }

        //TODO pay发送MQ消息，mall接受MQ消息
        amqpTemplate.convertAndSend(QUEUE_PAY_NOTIFY, new Gson().toJson(payInfo));


        /**
         * 4.告诉微信/支付宝不要再通知了
         */

        if (payResponse.getPayPlatformEnum() == BestPayPlatformEnum.WX) {
            //4. 告诉微信不要再通知了
            return "<xml>\n" +
                    "  <return_code><![CDATA[SUCCESS]]></return_code>\n" +
                    "  <return_msg><![CDATA[OK]]></return_msg>\n" +
                    "</xml>";
        }else if (payResponse.getPayPlatformEnum() == BestPayPlatformEnum.ALIPAY) {
            return "success";
        }

        throw new RuntimeException("异步通知中错误的支付平台");
    }

    @Override
    public PayInfo queryByOrderId(String orderId) {
        return payInfoMapper.selectByOrderNo(Long.parseLong(orderId));
    }

}
