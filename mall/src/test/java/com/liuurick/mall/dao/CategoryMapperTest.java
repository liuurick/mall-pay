package com.liuurick.mall.dao;

import com.liuurick.mall.MallApplicationTests;
import com.liuurick.mall.pojo.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liubin on 2020/7/21
 */
public class CategoryMapperTest extends MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void findCategoryById() {
        Category category = categoryMapper.findCategoryById(100001);
        System.out.println(category);
    }

    @Test
    public void queryById() {
        Category category =categoryMapper.queryById(100001);
        System.out.println(category);
    }
}