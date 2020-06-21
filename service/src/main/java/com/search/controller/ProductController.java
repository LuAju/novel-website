package com.search.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    @RequestMapping("/info")
    @ResponseBody
    public Object info () {
        return "hello product info";
    }
}
