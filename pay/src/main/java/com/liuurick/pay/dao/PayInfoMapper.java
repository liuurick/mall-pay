package com.liuurick.pay.dao;

import com.liuurick.pay.pojo.PayInfo;

<<<<<<< HEAD
public interface PayInfoMapper {
=======
<<<<<<< HEAD
public interface PayInfoMapper {
=======
<<<<<<< HEAD
public interface PayInfoMapper {
=======
<<<<<<< HEAD
public interface PayInfoMapper {
=======
/**
 * @author liubin
 */
public interface PayInfoMapper {

>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
    int deleteByPrimaryKey(Integer id);

    int insert(PayInfo record);

    int insertSelective(PayInfo record);

    PayInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayInfo record);

    int updateByPrimaryKey(PayInfo record);

	PayInfo selectByOrderNo(Long orderNo);
}