package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/25
 * Time:14:23
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {
}
