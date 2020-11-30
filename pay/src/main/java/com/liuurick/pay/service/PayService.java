package com.liuurick.pay.service;

import com.liuurick.pay.pojo.PayInfo;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

/**
 * @author liubin
 */
public interface PayService {
    /**
     * 创建支付
     * @param orderId 订单号
     * @param amount 订单金额
     * @param bestPayTypeEnum 支付类型
     * @return
     */
    PayResponse create(String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum);

    /**
     * 异步通知
     * @param notifyData
     * @return
     */
    String asyncNotify(String notifyData);


    /**
     * 查询订单
     * @param orderId
     * @return
     */
    PayInfo queryByOrderId(String orderId);
}
