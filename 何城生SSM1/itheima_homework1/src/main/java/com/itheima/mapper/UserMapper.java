package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

public interface UserMapper {
    //登录的方法
    public void login(User user);
    //查询所有的的方法
    List<User> finaAll()throws Exception;
}
