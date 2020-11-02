package com.liuurick.pay.service.impl;

import com.liuurick.pay.PayApplicationTests;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.core.AmqpTemplate;

import java.math.BigDecimal;

/**
 * Created by liubin on 2020/7/22
 */
public class PayServiceTest extends PayApplicationTests {

    @Autowired
    private PayService payService;

    @Autowired
    private AmqpTemplate amqbTemplate;
    @Test
    public void contextLoads() {
        payService.create("213936120771", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);

    }

    @Test
    public void sendMQMsg(){
        amqbTemplate.convertAndSend("payNotify","hello");
    }


}