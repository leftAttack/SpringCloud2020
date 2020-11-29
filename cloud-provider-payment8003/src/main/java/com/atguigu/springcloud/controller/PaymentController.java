package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author Yue_
 * @create 2020-11-26-21:38
 */
//@Slf4j
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serviceport;

    @PostMapping(value = "/payment/create")
    public CommonResult addPayment(@RequestBody Payment payment) {
        int result = paymentService.addPayment(payment);

        if (result > 0) {
            return new CommonResult(200, "数据插入成功:serviceport = " + serviceport, result);
        } else {
            return new CommonResult(500, "数据插入失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null){
            return new CommonResult(200,"查询成功:serviceport = " + serviceport,payment);
        }else{
            return new CommonResult(500,"查询失败");
        }
    }
}
