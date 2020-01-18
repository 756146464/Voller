package com.itheima.service;

import com.itheima.domain.Book;
import com.itheima.domain.User;

import java.util.List;

public interface UserService {

    public User login(String username, String password) throws Exception;

    List<Book> Userlist();
}
