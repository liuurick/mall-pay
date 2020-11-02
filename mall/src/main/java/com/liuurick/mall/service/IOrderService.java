package com.liuurick.mall.service;

import com.github.pagehelper.PageInfo;
import com.liuurick.mall.vo.OrderVo;
import com.liuurick.mall.vo.ResponseVo;

/**
 * Created by liubin on 2020/7/25
 */
public interface IOrderService {
    ResponseVo<OrderVo> create(Integer uid, Integer shippingId);

    ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);

    ResponseVo<OrderVo> detail(Integer uid, Long orderNo);

    ResponseVo cancel(Integer uid, Long orderNo);

    void paid(Long orderNo);
}
