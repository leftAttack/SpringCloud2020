package com.atguigu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Yue_
 * @create 2020-11-29-12:08
 */
@SpringBootApplication
@EnableConfigServer
//@EnableEurekaClient
public class ConfigMain3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3355.class,args);
    }
}
