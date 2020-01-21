package com.itheima.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import com.itheima.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: 汪诚
 * @Date: 2020/1/20 16:48
 */
@Controller
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;
    @RequestMapping("search")
    public String search(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                         @RequestParam(value = "pageSize",required = false,defaultValue = "12") Integer pageSize,String value, Model model){
        PageBean pageBean = new PageBean();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<Book> books = bookService.search(value);
        pageBean.setPageNum(page.getPageNum());
        pageBean.setPages(page.getPages());
        pageBean.setPageSize(page.getPageSize());
        pageBean.setTotal(page.getTotal());
        pageBean.setData(books);
        pageBean.setValue(value);

        model.addAttribute("page",pageBean);
        return "book_list";
    }
}
