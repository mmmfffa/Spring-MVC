package com.mf.controller;

import com.mf.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mf
 * @create 2021-04-16-16:55
 */
@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }
    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if(name==null){
            response.getWriter().println("false");
        }
        else if(name.equals("maFu")){
            response.getWriter().println("true");
        }else {
            response.getWriter().println("false");
        }
    }
    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> users = new ArrayList<User>();
        User user1 = new User("马1",3,"男");
        User user2 = new User("马2",3,"男");
        User user3 = new User("马3",3,"男");
        User user4 = new User("马4",3,"男");
        users.add(user1);users.add(user2);users.add(user3);users.add(user4);

        return users;
    }
    @RequestMapping( "/a3")
    public String a3(String name,String pwd){
        String msg="";
        if(name!=null){
            //mf应该从数据库中取出来
            if(name.equals("mf")){
                msg="ok";
            }else {
                msg="用户名错误";
            }
        }
        if(pwd!=null){
            if(pwd.equals("123")){
                msg="ok";
            }else {
                msg="密码错误";
            }
        }
        //若正确的话则返回一个ok响应
        return msg;
    }

}
