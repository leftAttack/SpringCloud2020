package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Yue_
 * @create 2020-11-28-15:32
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain8002.class,args);
    }

}
