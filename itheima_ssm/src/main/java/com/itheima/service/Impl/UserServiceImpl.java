package com.itheima.service.Impl;

import com.itheima.domain.Book;
import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) throws Exception {
       return userMapper.login(username,password);
    }

    @Override
    public List<Book> Userlist() {
        return userMapper.Userlist();
    }
}
