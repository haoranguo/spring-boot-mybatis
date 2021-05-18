package com.example.demo1;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@MapperScan("com/example/demo1/mapper")
@SpringBootApplication
public class Demo1Application {
    public Demo1Application() {
        log.debug("---> debug start! <------");
        log.info("---> info start! <------");
        log.warn("---> warn start! <------");
        log.error("---> error start! <------");
    }
    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        System.out.println(2);
    }

}
