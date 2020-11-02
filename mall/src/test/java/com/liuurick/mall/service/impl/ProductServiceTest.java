package com.liuurick.mall.service.impl;

import com.github.pagehelper.PageInfo;
import com.liuurick.mall.MallApplicationTests;
import com.liuurick.mall.enums.ResponseEnum;
import com.liuurick.mall.service.IProductService;
import com.liuurick.mall.vo.ProductDetailVo;
import com.liuurick.mall.vo.ResponseVo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liubin on 2020/7/25
 */
public class ProductServiceTest extends MallApplicationTests {

    @Autowired
    private IProductService productService;

    @Test
    public void list() {
        ResponseVo<PageInfo> responseVo = productService.list(null, 2, 3);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
    }

    @Test
    public void detail() {
        ResponseVo<ProductDetailVo> responseVo = productService.detail(26);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
    }
}