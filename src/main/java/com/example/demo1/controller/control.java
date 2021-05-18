package com.example.demo1.controller;

import com.example.demo1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class control {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/all")
    public @ResponseBody Object  all() {
        System.out.println(6);
        return userMapper.findUser();
    }
}
