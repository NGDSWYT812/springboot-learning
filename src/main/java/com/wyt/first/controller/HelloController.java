package com.wyt.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyt on 2017/11/15.
 * : hello  服务
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "hello world";
    }
}
