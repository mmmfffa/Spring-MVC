package com.mf.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mf.pojo.User;
import com.mf.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author mf
 * @create 2021-04-16-10:09
 * controller被视图解析器解析
 */
//@Controller
@RestController//所有方法只会返回json字符串，平时前后端分离时都不走视图解析器直接防护json
public class UserController {

    //@RequestMapping(value = "/json1",produces = "application/json;charset=utf-8")
    //统一解决乱码
    @RequestMapping( "/t1")
//    @ResponseBody //它就不会走视图解析器会直接返回一个字符串，阻止视图解析器的
    public String test(){
        return "hello";
    }

   //@RequestMapping(value = "/json1",produces = "application/json;charset=utf-8")
    //统一解决乱码
    @RequestMapping( "/json1")
//    @ResponseBody //它就不会走视图解析器会直接返回一个字符串，阻止视图解析器的
    public String json1() throws JsonProcessingException {
        //jackson objectMapper
//        ObjectMapper objectMapper = new ObjectMapper();

        //创建一个对象
        User user = new User("马",3,"男");
//        return objectMapper.writeValueAsString(user);
        return JsonUtils.getJson(user);
    }

    @RequestMapping( "/json2")
    public String json2() throws JsonProcessingException {

        ArrayList<User> users = new ArrayList<User>();
        User user1 = new User("马1",3,"男");
        User user2 = new User("马2",3,"男");
        User user3 = new User("马3",3,"男");
        User user4 = new User("马4",3,"男");
        users.add(user1);users.add(user2);users.add(user3);users.add(user4);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(users);
    }

    @RequestMapping( "/json3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();
//      objectMapper 默认时间解析为  Timestamp时间戳，距离1970的秒数
//       自定义日期的格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return new ObjectMapper().writeValueAsString(simpleDateFormat.format(date));
    }

    @RequestMapping( "/json4")
    public String json4() throws JsonProcessingException {
        Date date = new Date();
//      使用objectMapper来格式化输出
//      关闭时间戳的方式
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
//        objectMapper.setDateFormat(simpleDateFormat);
//
//        return objectMapper.writeValueAsString(date);
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping( "/json5")
    public String json5() throws JsonProcessingException {

        List<User> users = new ArrayList<User>();
        User user1 = new User("马1",3,"男");
        User user2 = new User("马2",3,"男");
        User user3 = new User("马3",3,"男");
        User user4 = new User("马4",3,"男");
        users.add(user1);users.add(user2);users.add(user3);users.add(user4);

        return JSON.toJSONString(users);

    }



}

