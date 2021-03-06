package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @author Yue_
 * @create 2020-11-26-21:30
 */
public interface PaymentService {

    public int addPayment(Payment payment);

    public Payment getPaymentById(Long id);

}
