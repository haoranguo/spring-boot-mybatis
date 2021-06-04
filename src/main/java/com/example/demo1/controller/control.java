package com.example.demo1.controller;

import com.example.demo1.entity.User;
import com.example.demo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class control {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/all")
    public @ResponseBody Object  all(User user) {
        System.out.println(user);
        return userMapper.findUser(user);
    }
}
