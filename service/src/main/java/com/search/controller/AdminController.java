package com.search.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @RequestMapping("/manage")
    @ResponseBody
    public Object manage(){
        return "hello manager";
    }
}
