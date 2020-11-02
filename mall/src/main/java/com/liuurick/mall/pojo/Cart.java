package com.liuurick.mall.pojo;

import lombok.Data;

/**
 * @Author: liubin ON 2020/7/21 9:43
 * @param:
 * @return
 * @Description:
 */

@Data
public class Cart {

	private Integer productId;

	private Integer quantity;

	private Boolean productSelected;

	public Cart() {
	}

	public Cart(Integer productId, Integer quantity, Boolean productSelected) {
		this.productId = productId;
		this.quantity = quantity;
		this.productSelected = productSelected;
	}
}
