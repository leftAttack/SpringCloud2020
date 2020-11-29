package com.atguigu.IRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yue_
 * @create 2020-11-28-10:15
 */
@Configuration
public class MyRule {

    @Bean
    public IRule getIRule(){
        return new RandomRule();
    }
}
