package com.itheima.interceptor;

import com.itheima.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //存储用户登录信息
        HttpSession session = request.getSession();
        //获取用户存储信息
        User user = (User) session.getAttribute("user");

        if (user==null){
            //检测用户没有登录
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            return false;
        }
        //检测用户登录了
        return true;
    }
}
