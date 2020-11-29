package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yue_
 * @create 2020-11-26-22:53
 */
@RestController
public class OrderController {

    public static final String PAYMENT_URI = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult addPayment(Payment payment){
        CommonResult commonResult = restTemplate.postForObject(PAYMENT_URI + "/payment/create", payment, CommonResult.class);
        return commonResult;
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        CommonResult commonResult = restTemplate.getForObject(PAYMENT_URI + "/payment/get/" + id, CommonResult.class);
        return commonResult;
    }

    // ====================> zipkin+sleuth
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin()
    {
        String result = restTemplate.getForObject(PAYMENT_URI + "/payment/zipkin/", String.class);
        return result;
    }

}
