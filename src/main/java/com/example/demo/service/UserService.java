package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/25
 * Time:10:30
 */
public interface UserService extends IService<User> {
    void save();
    void saveB();
}
