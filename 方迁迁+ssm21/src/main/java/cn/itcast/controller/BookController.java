package cn.itcast.controller;

import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import cn.itcast.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Summer
 * @Time: 2020/1/19 14:42
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/findAll")
    public String findAll(@RequestParam(value = "pageNum",required = true,defaultValue = "1") Integer pageNum, Model model){
        PageBean<Book> bookPages = bookService.findAll(pageNum);
        model.addAttribute("bookPages",bookPages);
        return "book_list";
    }
}
