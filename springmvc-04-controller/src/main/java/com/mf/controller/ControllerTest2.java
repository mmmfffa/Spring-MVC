package com.mf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mf
 * @create 2021-04-12-19:32
 */
@Controller
@RequestMapping("/admin")
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String index(Model model){
        model.addAttribute("msg","spring-controller-annotation!");
        return "hello";
    }
}
