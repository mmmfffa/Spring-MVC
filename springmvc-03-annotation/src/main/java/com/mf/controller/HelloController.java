package com.mf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mf
 * @create 2021-04-12-17:02
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("msg","HelloMVC-Annotation!");
        return "hello";//web-inf/jsp/hello.jsp
    }
}
