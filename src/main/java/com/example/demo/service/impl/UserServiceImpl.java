package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.OrderDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Order;
import com.example.demo.entity.User;
import com.example.demo.service.OrderService;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/25
 * Time:10:31
 */
@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    private final OrderService orderService;

    @Override
    public void save() {
        User user = new User();
        user.setName("laji");
        user.setCreateTime(new Date());
        int insert = this.baseMapper.insert(user);
//        if (insert >= 1) {
//            Order order = new Order();
//            order.setName(user.getName());
//            order.setUserId(user.getId());
//            order.setCreateTime(new Date());
//            orderService.insert(order);
//        }
//        int i = 1/0;
        this.saveB();
    }

    public void saveB() {
        User user = new User();
        user.setName("lajiB");
        user.setCreateTime(new Date());
        this.baseMapper.insert(user);
        int i = 1 / 0;
    }
}
