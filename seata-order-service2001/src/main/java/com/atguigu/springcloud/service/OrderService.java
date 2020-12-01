package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;
import org.springframework.stereotype.Service;

/**
 * @author Yue_
 * @create 2020-12-01-17:02
 */
public interface OrderService {

    void create(Order order);

}
