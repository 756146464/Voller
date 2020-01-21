package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    //用户登录的方法
    public void login(User user) throws Exception {
    }
    //查询所有的方法
    public List<User> findAll() throws Exception {
        return userMapper.finaAll();
    }


}
