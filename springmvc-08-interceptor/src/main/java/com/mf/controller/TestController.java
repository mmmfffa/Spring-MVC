package com.mf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mf
 * @create 2021-04-16-21:46
 */
@RestController
public class TestController {
    @GetMapping("/t1")
    public String test(){
        System.out.println("TestController=>test执行了");
        return "ok";
    }
}
