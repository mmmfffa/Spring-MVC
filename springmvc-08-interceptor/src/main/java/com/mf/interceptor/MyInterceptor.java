package com.mf.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mf
 * @create 2021-04-16-21:50
 */
public class MyInterceptor implements HandlerInterceptor {
    //return true 执行下一个拦截器 反行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("处理前====================================");
        return true;
    }
//后面两没什么用，可以加拦截日志
}
