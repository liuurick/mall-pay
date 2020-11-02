package com.liuurick.mall.service.impl;

import com.liuurick.mall.MallApplicationTests;
import com.liuurick.mall.dao.CategoryMapper;
import com.liuurick.mall.enums.ResponseEnum;
import com.liuurick.mall.vo.CategoryVo;
import com.liuurick.mall.vo.ResponseVo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by liubin on 2020/7/25
 */
public class CategoryServiceTest extends MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CategoryService categoryService;

    @Test
    public void selectAll() {
        ResponseVo<List<CategoryVo>> responseVo = categoryService.selectAll();
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(),responseVo.getStatus());

    }

    @Test
    public void findSubCategoryId() {
    }
}