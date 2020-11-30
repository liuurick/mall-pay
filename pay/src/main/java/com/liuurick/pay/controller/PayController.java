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
package com.liuurick.pay.controller;

import com.liuurick.pay.pojo.PayInfo;
import com.liuurick.pay.service.impl.PayService;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liubin on 2020/7/22
 */
@Controller
@RequestMapping("/pay")
@Slf4j
public class PayController {

    @Autowired
    private PayService payService;
    @Autowired
    private WxPayConfig wxPayConfig;

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId")String orderId, @RequestParam("amount")BigDecimal amount,
                                @RequestParam("payType") BestPayTypeEnum bestPayTypeEnum){

        PayResponse response = payService.create(orderId,amount,bestPayTypeEnum);

        Map<String,String> map = new HashMap<>();
        //map.put("codeUrl","weixin://wxpay/bizpayurl?pr=pGW0Eh9");

        if (bestPayTypeEnum == BestPayTypeEnum.WXPAY_NATIVE) {
            map.put("codeUrl", response.getCodeUrl());
            map.put("orderId", orderId);
            //map.put();
            return new ModelAndView("createForWxNative",map);
        }else if(bestPayTypeEnum == BestPayTypeEnum.ALIPAY_PC){
            map.put("body",response.getBody());
            return new ModelAndView("createForAlipayPc",map);
        }
        throw new RuntimeException("不支持的支付类型");
    }

    @PostMapping("/notify")
    @ResponseBody
    public String asyncNotify(@RequestBody String notifyData){
        //log.info("notifyData{}",notifyData);
        return payService.asyncNotify(notifyData);
    }

    @GetMapping("/queryByOrderId")
    @ResponseBody
    public PayInfo queryByOrderId(@RequestParam String orderId) {
        log.info("查询支付记录...");
        return payService.queryByOrderId(orderId);
    }

}
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
package com.liuurick.pay.controller;

import com.liuurick.pay.pojo.PayInfo;
import com.liuurick.pay.service.PayService;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author liubin
 */
@Controller
@RequestMapping("/pay")
@Slf4j
public class PayController {

    @Autowired
    private PayService payService;

    @Autowired
    private WxPayConfig wxPayConfig;

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId")String orderId,
                               @RequestParam("amount")BigDecimal amount,@RequestParam("payType") BestPayTypeEnum bestPayTypeEnum){

        PayResponse response = payService.create(orderId,amount,bestPayTypeEnum);
        Map<String,String> map = new HashMap<String, String>();

        if (bestPayTypeEnum == BestPayTypeEnum.WXPAY_NATIVE){
            map.put("codeUrl",response.getCodeUrl());
            map.put("orderId",orderId);
            map.put("returnUrl", wxPayConfig.getReturnUrl());
            return new ModelAndView("createForWxNative",map);

        }else if (bestPayTypeEnum == BestPayTypeEnum.ALIPAY_PC){
            map.put("body",response.getBody());
            return new ModelAndView("createForAliPayPc",map);
        }

        throw new RuntimeException("不支持的支付类型");

    }

    @PostMapping("/notify")
    @ResponseBody
    public String asyncNotify(@RequestBody String notifyData){
        log.info("notifyData{}",notifyData);
        return payService.asyncNotify(notifyData);
    }

    @GetMapping("/queryByOrderId")
    @ResponseBody
    public PayInfo queryByOrderId(@RequestParam String orderId) {
        log.info("查询支付记录...orderId....");
        return payService.queryByOrderId(orderId);
    }

}
>>>>>>> 7440304... 支付宝/微信支付功能的完善
>>>>>>> 51d3253... 支付宝/微信支付功能的完善
>>>>>>> 1700935... 支付宝/微信支付功能的完善
>>>>>>> 2689716... 支付宝/微信支付功能的完善
