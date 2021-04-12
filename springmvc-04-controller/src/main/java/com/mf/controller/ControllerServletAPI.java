package com.mf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author mf
 * @create 2021-04-12-19:56
 * 不需视图解析器
 */
@Controller
public class ControllerServletAPI {
    @RequestMapping("/test1")
   public void test1(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       resp.getWriter().println("write by ServletAPI");
   }
    @RequestMapping("/test2")
   public void test2(HttpServletRequest req, HttpServletResponse resp) throws IOException {
       resp.sendRedirect(req.getContextPath()+"/index.jsp");
   }
    @RequestMapping("/test3")
   public void test3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setAttribute("msg","by getRequestDispatcher");
       req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);

   }
}
