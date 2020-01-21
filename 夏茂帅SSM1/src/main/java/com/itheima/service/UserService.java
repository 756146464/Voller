package com.itheima.service;

import com.itheima.domain.User;

/**
 * @Author: 汪诚
 * @Date: 2020/1/20 13:59
 */
public interface UserService {
    User login(User user) throws Exception;
}
