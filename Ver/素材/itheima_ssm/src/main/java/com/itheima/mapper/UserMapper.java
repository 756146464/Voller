package com.itheima.mapper;

import com.itheima.domain.Book;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM user WHERE username = #{username} AND password = #{password}")
    User login(@Param("username") String username,@Param("password") String password);

    @Select("SELECT * FROM book")
    List<Book> Userlist();
}
