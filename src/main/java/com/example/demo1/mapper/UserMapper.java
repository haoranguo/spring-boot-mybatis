package com.example.demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo1.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface UserMapper extends BaseMapper<User> {
//    @Select(value = "select * from user")
    List<User> findUser (User user);
}