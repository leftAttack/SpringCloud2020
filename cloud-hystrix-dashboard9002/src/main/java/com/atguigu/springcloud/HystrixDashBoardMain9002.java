package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Yue_
 * @create 2020-11-28-18:17
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardMain9002 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoardMain9002.class,args);
    }

}
