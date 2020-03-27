package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.OrderDao;
import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/25
 * Time:14:29
 */
@Service
@AllArgsConstructor
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Throwable.class)
    public void insert(Order order) {
        this.baseMapper.insert(order);
    }
}
