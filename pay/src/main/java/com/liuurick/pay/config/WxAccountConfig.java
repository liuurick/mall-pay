package com.liuurick.pay.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
 * Created by liubin on 2020/7/22
 */
@Component
@ConfigurationProperties(prefix = "wx")
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
 * @author liubin
 */
@Component
@ConfigurationProperties(prefix = "wxpay")
>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
@Data
public class WxAccountConfig {

    private String appId;

    private String mchId;

    private String mchKey;

    private String notifyUrl;

    private String returnUrl;
}
