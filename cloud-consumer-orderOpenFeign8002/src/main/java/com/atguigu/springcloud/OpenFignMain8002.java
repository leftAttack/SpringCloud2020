package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Yue_
 * @create 2020-11-28-10:40
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFignMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(OpenFignMain8002.class,args);
    }



}
