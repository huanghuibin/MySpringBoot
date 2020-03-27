package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Order;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/25
 * Time:14:27
 */
public interface OrderService extends IService<Order> {
    void insert(Order order);
}
