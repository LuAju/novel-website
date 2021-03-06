package com.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ElasticSearch8081 {
    public static void main(String[] args) {
        SpringApplication.run(ElasticSearch8081.class, args);
    }
}
