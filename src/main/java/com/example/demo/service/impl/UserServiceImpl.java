package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/25
 * Time:10:31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
