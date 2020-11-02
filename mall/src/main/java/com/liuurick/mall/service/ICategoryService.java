package com.liuurick.mall.service;

import com.liuurick.mall.vo.CategoryVo;
import com.liuurick.mall.vo.ResponseVo;

import java.util.List;
import java.util.Set;

/**
 * Created by liubin on 2020/7/25
 */

public interface ICategoryService {

    ResponseVo<List<CategoryVo>> selectAll();

    void findSubCategoryId(Integer id, Set<Integer> resultSet);
}
