package com.itheima.mapper;

import com.itheima.domain.Book;

import java.util.List;

/**
 * @Author: 汪诚
 * @Date: 2020/1/20 16:51
 */
public interface BookMapper {

    public List<Book> search(String value);
}
