package com.mf.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author mf
 * @create 2021-04-17-10:39
 */
@SuppressWarnings("ALL")
public class loginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
         //判断什么情况情况下没有登录，放行登录什么时候
        HttpSession session = request.getSession();
//        本来就在登录页面也放行
        if(request.getRequestURI().contains("goLogin")){
            return true;
        }
//        第一次登录
        if(request.getRequestURI().contains("login")){
            return true;
        }
//       第一次登录也是没有session的
        if(session.getAttribute("userLoginInfo")!=null){
            return  true;
        }
//        其他情况下转发
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
