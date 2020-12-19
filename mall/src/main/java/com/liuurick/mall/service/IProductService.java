package com.liuurick.mall.service;

import com.liuurick.mall.vo.ProductDetailVo;
import com.liuurick.mall.vo.ResponseVo;
import com.github.pagehelper.PageInfo;

/**
 * Created by liubin on 2020/7/25
 */
public interface IProductService {
    ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);

    ResponseVo<ProductDetailVo> detail(Integer productId);
}
