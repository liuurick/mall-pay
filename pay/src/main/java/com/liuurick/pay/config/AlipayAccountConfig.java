package com.liuurick.pay.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * Created by liubin on 2020/7/22
=======
<<<<<<< HEAD
 * Created by liubin on 2020/7/22
=======
<<<<<<< HEAD
 * Created by liubin on 2020/7/22
=======
<<<<<<< HEAD
 * Created by liubin on 2020/7/22
=======
 * @author liubin
>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
 */
@Component
@ConfigurationProperties(prefix = "alipay")
@Data
public class AlipayAccountConfig {

    private String appId;

    private String privateKey;

    private String publicKey;

    private String notifyUrl;

    private String returnUrl;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

    private String serverUrl;
>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
}