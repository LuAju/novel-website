package com.search.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("测试接口")
public class SayHello {
    @GetMapping(value = "/sayHello/{name}")
    @ApiOperation("测试方法")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名",  required = true)
    })

    public Object sayHello(@PathVariable  String name){
        return "hello" + name;
    }
}
