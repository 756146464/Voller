package cn.itcast.mapper;

import cn.itcast.domain.Book;
import cn.itcast.domain.User;

import java.util.List;

public interface UserMapper {
    User login(User user);


    List<Book> findAll(Integer pageNum, Integer pageSize);
}
