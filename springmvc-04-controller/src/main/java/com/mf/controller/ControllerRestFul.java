package com.mf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mf
 * @create 2021-04-12-19:42
 * PathVariable注解将参数绑定到url模板上，还可以自动进行类型装换
 */
@Controller
public class ControllerRestFul {

    @RequestMapping("/restful/{p1}/{p2}")
    public String index(@PathVariable int p1, @PathVariable int p2, Model model){
        int result=p1+p2;
        model.addAttribute("msg","结果"+result);
        return "hello";
    }
}
