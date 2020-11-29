package com.atguigu.springcloud;

import com.atguigu.IRule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Yue_
 * @create 2020-11-26-22:51
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyRule.class)
public class OrderMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain8002.class,args);
    }

}
