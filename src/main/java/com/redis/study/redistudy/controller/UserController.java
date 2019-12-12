package com.redis.study.redistudy.controller;

import com.redis.study.redistudy.pojo.IMoocJSONResult;
import com.redis.study.redistudy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public User getUser(){

        User u = new User();
        u.setName("imooc1");
        u.setAge(123);
        u.setBirthday(new Date());
        u.setPassWord("123456");
        u.setDesc("不错");

        return u;
    }

    @RequestMapping("/getUserJson")
    public IMoocJSONResult getUserJson(){

        User u = new User();
        u.setName("imooc1");
        u.setAge(21);
        u.setBirthday(new Date());
        u.setPassWord("123456");
        u.setDesc("不错");

        return IMoocJSONResult.ok(u);
    }
}
