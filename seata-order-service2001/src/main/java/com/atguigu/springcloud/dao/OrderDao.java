package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yue_
 * @create 2020-12-01-16:42
 */
@Mapper
public interface OrderDao {

    void createOrder(Order order);

    void updataOrderStatusByUserId(@Param("userId") Long userId);
}
