package com.example.demo1.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Data
public class User {
    private Long id;
    private String name;
    private int age;
    private String email;
}