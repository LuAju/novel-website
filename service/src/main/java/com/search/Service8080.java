package com.search;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@MapperScan("com.search.dao")
public class Service8080 {
    public static void main(String[] args) {
        SpringApplication.run(Service8080.class, args);
    }
}
