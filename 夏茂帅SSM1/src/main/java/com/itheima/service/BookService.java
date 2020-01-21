package com.itheima.service;

import com.itheima.domain.Book;

import java.util.List;

/**
 * @Author: 汪诚
 * @Date: 2020/1/20 16:57
 */
public interface BookService {

    public List<Book> search(String value);
}
