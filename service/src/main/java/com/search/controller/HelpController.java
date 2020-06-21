package com.search.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/help")
public class HelpController {
    @RequestMapping("all")
    public Object help(){
        return "help all";
    }
}
