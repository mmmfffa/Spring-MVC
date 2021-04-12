package com.mf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mf
 * @create 2021-04-12-20:31
 * springmvc实现转发和重定向，视图解析器可要可不要,不要的话注意路径即可
 */
@Controller
public class ControllerSpringMVC {
    @RequestMapping("/mvctest1")
    public String test1(){
        //默认转发
        return "/index.jsp";
    }
    @RequestMapping("/mvctest2")
    public String test2(){
        //转发
        return "forward:/index.jsp";
    }
    @RequestMapping("/mvctest3")
    public String test3(){
        return "redirect:/index.jsp";
    }

}
