package com.mf.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mf
 * @create 2021-04-12-17:41
 * 控制器controller:
 * 控制器提供访问应用程序的行为，通常接口定义和注解定义两种方法实现
 * 控制器负责解析用户请求并将其转换为一个模型
 * 控制器可以包含多个方法实现复用
 * controller的springmvc配置方式有多种
 * 实现接口Controller定义控制器是比较老的方法，缺点是一个控制器只有一个方法，如果多个则需要定义多个Controller比较麻烦
 * 注解controller声明spring类的实例是一个控制器，声明组件扫描，视图可以复用，弱耦合
 * requestmapping用于映射url到控制器类或一个特定的处理程序方法。
 */
public class ControllerTest1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","Test1-implements-Controller!");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
