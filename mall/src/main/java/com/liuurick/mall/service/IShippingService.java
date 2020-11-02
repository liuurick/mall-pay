package com.liuurick.mall.service;

import com.github.pagehelper.PageInfo;
import com.liuurick.mall.form.ShippingForm;
import com.liuurick.mall.vo.ResponseVo;

import java.util.Map;

/**
 * Created by liubin on 2020/7/25
 */
public interface IShippingService {
    ResponseVo<Map<String, Integer>> add(Integer uid, ShippingForm form);

    ResponseVo delete(Integer uid, Integer shippingId);

    ResponseVo update(Integer uid, Integer shippingId, ShippingForm form);

    ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);
}
