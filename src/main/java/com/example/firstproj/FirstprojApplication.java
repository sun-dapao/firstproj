package com.example.firstproj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.example.firstproj.controller"})
@SpringBootApplication
@MapperScan("com.example.firstproj.mapper")
public class FirstprojApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstprojApplication.class, args);
    }

}
