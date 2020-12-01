package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yue_
 * @create 2020-11-30-10:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigMain3388 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain3388.class,args);
    }
}
