package com.mf.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author mf
 * @create 2021-04-12-15:53
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //取得参数
        String method=req.getParameter("method");
        if(method!=null){//当url没有method这个属性时候，method为null，当有这个属性当没有值时method为空串
            if(method.equals("add")){
                req.getSession().setAttribute("msg","执行了add方法");
            }
            if(method.equals("delete")){
                req.getSession().setAttribute("msg","执行了delete方法");
            }
        }
        else
            req.getSession().setAttribute("msg","null");//不传递msg的话，hello.jsp页面会默认从上一次缓存当中读取
        //业务逻辑
        //视图跳转(转发or重定向)
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }


}
