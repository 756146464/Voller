package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    //注入UserService
    @Autowired
    private UserService userService;
    //登录验证
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,Model model) throws Exception {
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        if (userService.login(user)!=null){
            model.addAttribute("username",username);
            return "login.jsp";
        }else{
            model.addAttribute("error","账号和密码错误");
            return "login";
        }

    }

    @RequestMapping("/findAll")
    public List<User> findAll()throws Exception{
        return  userService.findAll();
    }



}
