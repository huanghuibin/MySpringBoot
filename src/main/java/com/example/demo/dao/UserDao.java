package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/25
 * Time:9:54
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
