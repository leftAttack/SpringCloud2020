package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.handler.CustomerBlockHandler;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yue_
 * @create 2020-12-01-10:19
 */
@RestController
public class RateLimitController {

    @GetMapping(value = "/rateLimit/customerBlockHandler",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @SentinelResource(value = "customerBlockHandler",
    blockHandlerClass = CustomerBlockHandler.class,
    blockHandler = "customerBlockHandler1")
    public CommonResult customerBlockHandler()
    {
        return new CommonResult(200,"按客戶自定义",new Payment(2020L,"serial003"));
    }
}
