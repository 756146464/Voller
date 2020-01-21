package cn.itcast.controller;

import cn.itcast.domain.Book;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user) {

        User user1 = userService.login(user);
        if (user1 != null) {
            //登录成功
            return "redirect:/book_list.jsp";
        }
        //登录失败
        return "redirect:/login.jsp";
    }

    @RequestMapping("/findAll")
    public String findAll(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "pageSize",required = false,defaultValue = "1") Integer pageSize, Model model)throws Exception{
        List<Book> productList =userService.findAll(pageNum,pageSize);

        PageInfo<Book> pageInfo=new PageInfo<Book>(productList);


        model.addAttribute("pageInfo",pageInfo);
        return "redirect:/book_list.jsp";
    }

}
