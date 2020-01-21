package cn.itcast.service.impl;

import cn.itcast.domain.Book;
import cn.itcast.mapper.BookMapper;
import cn.itcast.service.BookService;
import cn.itcast.utils.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Summer
 * @Time: 2020/1/19 14:44
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public PageBean<Book> findAll(Integer pageNum) {
        PageHelper.startPage(pageNum,12);
        List<Book> bookList = bookMapper.findAll();
        PageInfo<Book> pageInfo = new PageInfo<>(bookList);
        PageBean<Book> pageBean = new PageBean<Book>();
        pageBean.setPageNum(pageNum);
        pageBean.setPageSize(12);
        pageBean.setPages(pageInfo.getPages());
        pageBean.setTotal((int)pageInfo.getTotal());
        pageBean.setBookList(pageInfo.getList());
        return pageBean;
    }
}
