package cn.itcast.Controller;


import cn.itcast.Service.UserService;
import cn.itcast.domain.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/save")
    public String save(User user) throws Exception {
        service.save(user);
        return "/pages/subscribe-form";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model) throws Exception {
        List<User> users = service.findAll();
        model.addAttribute("userList",users);
        return "/pages/patients-list";
    }
    @RequestMapping("findById")
    public String findById(String is, Model model) throws Exception{
        List<User> users = service.findById(is);
        model.addAttribute("userList",users);
        return "/pages/patients-list";
    }
}
