package com.liuurick.mall.service;

import com.liuurick.mall.pojo.User;
import com.liuurick.mall.vo.ResponseVo;

/**
 * Created by liubin on 2020/7/23
 */
public interface IUserService {
    /**
     * 注册
     */
    ResponseVo<User> register(User user);

    /**
     * 登录
     */
    ResponseVo<User> login(String username, String password);
}
