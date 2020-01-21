package com.itheima.service.impl;

import com.itheima.domain.Book;
import com.itheima.mapper.BookMapper;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 汪诚
 * @Date: 2020/1/20 16:58
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> search(String value) {
        List<Book> books = bookMapper.search(value);
        System.out.println(value);
        System.out.println(books);
        return books;
    }
}
