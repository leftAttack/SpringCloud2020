package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Yue_
 * @create 2020-11-30-22:18
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        try {
            System.out.println(Thread.currentThread().getName());
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }


    @GetMapping("/testC")
    @SentinelResource(value = "testC",blockHandler = "deal_testC")
    public String testC(@RequestParam(value = "p1",required = false)String p1,
                        @RequestParam(value = "p2",required = false)String p2) {
        return "------testC";
    }

    @GetMapping("/deal_testC")
    public String deal_testC(String p1, String p2, BlockException exception){
        return "------deal_testC";
    }

}
