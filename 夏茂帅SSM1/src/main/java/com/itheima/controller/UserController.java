package com.itheima.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.domain.Book;
import com.itheima.domain.User;
import com.itheima.service.BookService;
import com.itheima.service.UserService;
import com.itheima.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: 汪诚
 * @Date: 2020/1/20 13:53
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @RequestMapping("login")
    public String login(User user, Model model, HttpSession session) throws Exception {
        User u = userService.login(user);
        System.out.println(u);
        if (u == null){
            model.addAttribute("message","用户名或密码错误");
            return "login";
        }
        session.setAttribute("user",u);
        PageBean pageBean = new PageBean();
        Page<Object> page = PageHelper.startPage(1, 12);
        List<Book> books = bookService.search(null);
        pageBean.setPageNum(page.getPageNum());
        pageBean.setPages(page.getPages());
        pageBean.setPageSize(page.getPageSize());
        pageBean.setTotal(page.getTotal());
        pageBean.setData(books);

        model.addAttribute("page",pageBean);
        return "book_list";
    }
}
