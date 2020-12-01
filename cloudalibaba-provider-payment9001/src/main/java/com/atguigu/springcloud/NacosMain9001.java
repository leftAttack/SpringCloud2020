package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yue_
 * @create 2020-11-30-9:15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(NacosMain9001.class,args);
    }
}
