package com.mf.controller;

import com.mf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mf
 * @create 2021-04-12-20:39
 */
@Controller
public class ControllerUser {
    @RequestMapping("/user")
    public String test1(@RequestParam("username") String name){
        System.out.println(name);
        return "redirect:/index.jsp";
    }

    @RequestMapping("/user2")
    public String test2(User user){
        System.out.println(user);
        return "hello";
    }
}
