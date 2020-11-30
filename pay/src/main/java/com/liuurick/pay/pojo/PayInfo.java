package com.liuurick.pay.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
/**
 * @author liubin
 */
>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
@Data
public class PayInfo {
    private Integer id;

    private Integer userId;

    private Long orderNo;

    private Integer payPlatform;

    private String platformNumber;

    private String platformStatus;

    private BigDecimal payAmount;

    private Date createTime;

    private Date updateTime;

    public PayInfo(Long orderNo, Integer payPlatform, String platformStatus, BigDecimal payAmount) {
        this.orderNo = orderNo;
        this.payPlatform = payPlatform;
        this.platformStatus = platformStatus;
        this.payAmount = payAmount;
    }
}