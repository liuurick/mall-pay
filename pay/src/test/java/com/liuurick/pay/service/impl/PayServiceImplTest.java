package com.liuurick.pay.service.impl;

import com.liuurick.pay.PayApplicationTests;
import com.liuurick.pay.service.PayService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Created by liubin on 2020/11/25
 */
public class PayServiceImplTest extends PayApplicationTests {

    @Autowired
    private PayService payService;
    @Test
    public void create() {
        //String orderId, BigDecimal amount
        //payService.create("12345621321421421", BigDecimal.valueOf(0.01), bestPayTypeEnum);
    }
}