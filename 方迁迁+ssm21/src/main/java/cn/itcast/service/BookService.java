package cn.itcast.service;

import cn.itcast.domain.Book;
import cn.itcast.utils.PageBean;

/**
 * @Author: Summer
 * @Time: 2020/1/19 14:43
 */
public interface BookService {
    PageBean<Book> findAll(Integer pageNum);
}
