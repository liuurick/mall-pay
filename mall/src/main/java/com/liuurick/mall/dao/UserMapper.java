package com.liuurick.mall.dao;

import com.liuurick.mall.pojo.User;

/**
 * @author liubin
 */
public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);

    int deleteByPrimaryKey(Integer id);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int countByUsername(String username);

    int countByEmail(String email);

    User selectByUsername(String username);
}