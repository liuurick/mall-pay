package com.liuurick.pay.config;

import com.lly835.bestpay.config.AliPayConfig;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.service.BestPayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 *
 */
@Configuration
=======
<<<<<<< HEAD
 *
 */
@Configuration
=======
<<<<<<< HEAD
 *
 */
@Configuration
=======
<<<<<<< HEAD
 *
 */
@Configuration
=======
 * @author liubin
 */
@Component
>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
public class BestPayConfig {

	@Autowired
	private WxAccountConfig wxAccountConfig;

	@Autowired
	private AlipayAccountConfig alipayAccountConfig;

	@Bean
<<<<<<< HEAD
	public BestPayService bestPayService(WxPayConfig wxPayConfig) {
=======
<<<<<<< HEAD
	public BestPayService bestPayService(WxPayConfig wxPayConfig) {
=======
<<<<<<< HEAD
	public BestPayService bestPayService(WxPayConfig wxPayConfig) {
=======
<<<<<<< HEAD
	public BestPayService bestPayService(WxPayConfig wxPayConfig) {
=======
	public BestPayService bestPayServiceByWX(WxPayConfig wxPayConfig) {
>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
		AliPayConfig aliPayConfig = new AliPayConfig();
		aliPayConfig.setAppId(alipayAccountConfig.getAppId());
		aliPayConfig.setPrivateKey(alipayAccountConfig.getPrivateKey());
		aliPayConfig.setAliPayPublicKey(alipayAccountConfig.getPublicKey());
		aliPayConfig.setNotifyUrl(alipayAccountConfig.getNotifyUrl());
		aliPayConfig.setReturnUrl(alipayAccountConfig.getReturnUrl());

		BestPayServiceImpl bestPayService = new BestPayServiceImpl();
		bestPayService.setWxPayConfig(wxPayConfig);
		bestPayService.setAliPayConfig(aliPayConfig);
		return bestPayService;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
	}

	@Bean
	public WxPayConfig wxPayConfig() {
		WxPayConfig wxPayConfig = new WxPayConfig();
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======

	}

	@Bean
	public AliPayConfig aliPayConfig(){
		AliPayConfig aliPayConfig = new AliPayConfig();

		aliPayConfig.setAppId(alipayAccountConfig.getAppId());
		aliPayConfig.setPrivateKey(alipayAccountConfig.getPrivateKey());
		aliPayConfig.setAliPayPublicKey(alipayAccountConfig.getPublicKey());
		aliPayConfig.setNotifyUrl(alipayAccountConfig.getNotifyUrl());
		aliPayConfig.setReturnUrl(alipayAccountConfig.getReturnUrl());

		return aliPayConfig;
	}


	@Bean
	public WxPayConfig wxPayConfig() {
		WxPayConfig wxPayConfig = new WxPayConfig();

>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
		wxPayConfig.setAppId(wxAccountConfig.getAppId());
		wxPayConfig.setMchId(wxAccountConfig.getMchId());
		wxPayConfig.setMchKey(wxAccountConfig.getMchKey());

		wxPayConfig.setNotifyUrl(wxAccountConfig.getNotifyUrl());
		wxPayConfig.setReturnUrl(wxAccountConfig.getReturnUrl());
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
		return wxPayConfig;
	}
}
