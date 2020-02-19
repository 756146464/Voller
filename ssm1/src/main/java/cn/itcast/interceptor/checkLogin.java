package cn.itcast.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//拦截器,判断用户是否登录
public class checkLogin implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("user");
        //判断用户是否登录,如果没有登录,重定向到登录界面
        if (user==null){
           response.sendRedirect(request.getContextPath()+"/login.jsp");
           return false;
        }
        //已经登录,放行
        return true;
    }
}
