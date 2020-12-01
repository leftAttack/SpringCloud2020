package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.service.AccountService;
import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yue_
 * @create 2020-12-01-17:03
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     */

    @Override
    public void create(Order order) {
        //新建订单
        System.out.println("开始新建订单");
        orderDao.createOrder(order);
        //扣减库存
        System.out.println("调用库存服务扣减库存");
        accountService.decreaseAccount(order.getProductId(),order.getCount());
        //扣减账户
        System.out.println("调用账户服务扣减账户余额");
        storageService.decreaseStroage(order.getUserId(),order.getMoney());
        //修改订单状态，从零到1代表已经完成
        System.out.println("修改订单状态");
        orderDao.updataOrderStatusByUserId(order.getUserId());
        System.out.println("下订单结束了");
    }
}
