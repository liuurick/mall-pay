package com.liuurick.pay.dao;

import com.liuurick.pay.pojo.PayInfo;

/**
 * @author liubin
 */
public interface PayInfoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PayInfo record);

    int insertSelective(PayInfo record);

    PayInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayInfo record);

    int updateByPrimaryKey(PayInfo record);

	PayInfo selectByOrderNo(Long orderNo);
}