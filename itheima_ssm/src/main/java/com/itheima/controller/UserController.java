package com.itheima.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.domain.Book;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService usreService;

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session) throws Exception{
        System.out.println(username);
        //获取用户信息
       User user= usreService.login(username,password);
        System.out.println(user);
       //判断用户是否登录成功
       if (user!=null){
           //登录成功将用户信息存入session中
           System.out.println(username);
           session.setAttribute("user",user);
           User user1 = (User) session.getAttribute("user");
           System.out.println(user1);
       }
        return "redirect:/User/Userlist.do";
    }


    @RequestMapping("/Userlist")
    public String Userlogin(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum ,
                            @RequestParam(value = "pageSize",required = false,defaultValue = "12") Integer pageSize, Model model) throws Exception{
        PageHelper.startPage(pageNum,pageSize);
       List<Book> books = usreService.Userlist();
        PageInfo<Book> pageInfo = new PageInfo<>(books);
       model.addAttribute("UserList",pageInfo);
       return "/book_list";
    }
}
