package com.mf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author mf
 * @create 2021-04-16-22:12
 */
@Controller
@RequestMapping("/user")
public class LoginController {
   @RequestMapping("/login")
    public String login(HttpSession session, String name, String pwd, Model model){
       //把用户的信息存在session中
       System.out.println("login=>"+name);
       session.setAttribute("userLoginInfo",name);
       model.addAttribute("name",name);
      return "main";
    }
    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        session.removeAttribute("userLoginInfo");
        return "main";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/goLogin")
    public String gonLogin(){
        return "login";
    }
}
