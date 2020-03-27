package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/25
 * Time:14:23
 */
@Data
@TableName("tb_order")
public class Order implements Serializable {

    @TableId(type=IdType.AUTO)
    private Integer id;

    private String name;

    private Integer userId;

    private Date createTime;

}
