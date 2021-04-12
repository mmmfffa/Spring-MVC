package com.mf.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mf
 * @create 2021-04-12-16:36
 * 编写我们要操作业务Controller
 * (1)要么实现Controller接口
 * (2)要么增加注解
 * 返回一个ModelAndView，装数据，封视图
 */

@SuppressWarnings("ALL")
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","helloMVC");//装数据
        modelAndView.setViewName("hello");//封视图，相当于WEB-INF/jsp/hello.jsp
        return modelAndView;
    }
}
