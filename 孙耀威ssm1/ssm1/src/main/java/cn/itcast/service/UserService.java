package cn.itcast.service;

import cn.itcast.domain.Book;
import cn.itcast.domain.User;

import java.util.List;

public interface UserService {
    User login(User user);

    List<Book> findAll(Integer pageNum, Integer pageSize);
}
