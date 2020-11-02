package com.liuurick.pay.service;

import com.liuurick.pay.pojo.PayInfo;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

/**
 * Created by liubin on 2020/7/22
 */
public interface IPayService {
    /**
     * 创建支付
     * @param orderId
     * @param amount
     * @return
     */
    PayResponse create(String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum);


    /**
     * 异步通知处理
     * @param notifyData
     */
    String asyncNotify(String notifyData);

    PayInfo queryByOrderId(String orderId);
}
