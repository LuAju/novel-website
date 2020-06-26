package com.search;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.search.dao")
public class Picture8083 {
    public static void main(String[] args) {
        SpringApplication.run(Picture8083.class, args);
    }
}
