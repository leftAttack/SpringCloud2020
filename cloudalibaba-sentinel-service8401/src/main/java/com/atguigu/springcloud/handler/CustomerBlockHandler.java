package com.atguigu.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author Yue_
 * @create 2020-12-01-10:18
 */
public class CustomerBlockHandler {

    public static CommonResult customerBlockHandler1(BlockException e){
        return new CommonResult(200,"按客戶自定义,globl---1");
    }

    public static CommonResult customerBlockHandler2(){
        return new CommonResult(200,"按客戶自定义,globl---2");
    }
}
