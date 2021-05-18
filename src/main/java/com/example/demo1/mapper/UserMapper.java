package com.example.demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo1.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    public List<User> findUser ();
}