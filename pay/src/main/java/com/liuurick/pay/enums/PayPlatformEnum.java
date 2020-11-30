package com.liuurick.pay.enums;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import lombok.Getter;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
/**
 * @author liubin
 */
>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
@Getter
public enum PayPlatformEnum {

	//1-支付宝,2-微信
	ALIPAY(1),

	WX(2),
	;

	Integer code;

	PayPlatformEnum(Integer code) {
		this.code = code;
	}

	public static PayPlatformEnum getByBestPayTypeEnum(BestPayTypeEnum bestPayTypeEnum) {
		for (PayPlatformEnum payPlatformEnum : PayPlatformEnum.values()) {
			if (bestPayTypeEnum.getPlatform().name().equals(payPlatformEnum.name())) {
				return payPlatformEnum;
			}
		}
		throw new RuntimeException("错误的支付平台: " + bestPayTypeEnum.name());
	}
}
