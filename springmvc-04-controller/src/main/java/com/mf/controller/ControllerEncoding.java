package com.mf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.jsp.PageContext;

/**
 * @author mf
 * @create 2021-04-12-20:51
 */
@Controller
public class ControllerEncoding {
    @RequestMapping("e/t")
    public String test(Model model,String name){
        model.addAttribute("msg",name);
        return "hello";
    }
}
