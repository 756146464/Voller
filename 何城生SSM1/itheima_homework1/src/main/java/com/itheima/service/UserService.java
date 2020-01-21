package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    //用户登录的方法
    public void login(User user)throws Exception;
    //查询所有的的方法
    List<User> findAll() throws Exception;
}
