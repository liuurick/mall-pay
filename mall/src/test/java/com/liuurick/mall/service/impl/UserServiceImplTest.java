package com.liuurick.mall.service.impl;

import com.liuurick.mall.MallApplicationTests;
import com.liuurick.mall.dao.UserMapper;
import com.liuurick.mall.pojo.User;
import com.liuurick.mall.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * Created by liubin on 2020/12/15
 */
@Transactional
public class UserServiceImplTest extends MallApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testRegister() {
        User user = new User("liubin","1234455","liuurick@qq.com");
        user.setRole(1);
        userMapper.insertSelective(user);
    }
}