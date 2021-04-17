package com.mf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author mf
 * @create 2021-04-12-19:50
 */
@Controller
public class ControllerMethod {
    //等价于  @RequestMapping(value = "/method",method = RequestMethod.GET)

//    @GetMapping("/method")
    @RequestMapping("/method")
    public String index(Model model){
        model.addAttribute("msg","Method!");
        return "hello";
    }
}
