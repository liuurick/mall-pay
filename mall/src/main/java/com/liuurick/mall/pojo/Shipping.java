package com.liuurick.mall.pojo;

import lombok.Data;

import java.util.Date;


/**
 * @Author: liubin ON 2020/7/26 8:46
 * @param:
 * @return
 * @Description:收货信息
 */

@Data
public class Shipping {
    private Integer id;

    private Integer userId;

    private String receiverName;

    private String receiverPhone;

    private String receiverMobile;

    private String receiverProvince;

    private String receiverCity;

    private String receiverDistrict;

    private String receiverAddress;

    private String receiverZip;

    private Date createTime;

    private Date updateTime;

}