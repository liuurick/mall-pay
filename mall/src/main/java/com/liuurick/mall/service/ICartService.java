package com.liuurick.mall.service;

import com.liuurick.mall.form.CartAddForm;
import com.liuurick.mall.form.CartUpdateForm;
import com.liuurick.mall.pojo.Cart;
import com.liuurick.mall.vo.CartVo;
import com.liuurick.mall.vo.ResponseVo;

import java.util.List;

/**
 * Created by liubin on 2020/7/25
 */
public interface ICartService {
    ResponseVo<CartVo> add(Integer uid, CartAddForm form);

    ResponseVo<CartVo> list(Integer uid);

    ResponseVo<CartVo> update(Integer uid, Integer productId, CartUpdateForm form);

    ResponseVo<CartVo> delete(Integer uid, Integer productId);

    ResponseVo<CartVo> selectAll(Integer uid);

    ResponseVo<CartVo> unSelectAll(Integer uid);

    ResponseVo<Integer> sum(Integer uid);

    List<Cart> listForCart(Integer uid);
}
