package com.shu.leave.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("admin_info")     // 类名跟表明不一致时才需要加这个注解，用于告知mybatis-plus去查哪个表
public class Admin {

    // 主键id 自增
    private Long id;

    // 当前登录用户的工号
    private String userId;

    // 当前登录用户的姓名
    private String userName;

    // 逻辑删除
    private String isDeleted;

    // 创建时间
    private Date gmtCreate;

    // 修改时间
    private Date gmtModified;
}