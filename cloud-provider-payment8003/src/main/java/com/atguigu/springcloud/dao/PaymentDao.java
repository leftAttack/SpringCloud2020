package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yue_
 * @create 2020-11-26-21:14
 */
@Mapper
public interface PaymentDao {

    public int addPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
