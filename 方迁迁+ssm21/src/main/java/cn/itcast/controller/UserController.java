package cn.itcast.controller;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: Summer
 * @Time: 2020/1/19 11:37
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(User user, Model model,HttpSession session) {
        User existUser = userService.findUser(user);
        System.out.println(user);
        System.out.println(existUser);
        if(existUser != null){
            session.setAttribute("user",existUser);
            return "redirect:/book/findAll";
        }else {
            model.addAttribute("error", "用户名或密码错误!");
            return "login";
        }
    }
}
