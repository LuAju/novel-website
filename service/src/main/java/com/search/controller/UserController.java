package com.search.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.search.entity.UmsAdmin;
import com.search.result.CommonResult;
import com.search.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api("用户接口")
public class UserController {
    @Autowired
    private UmsAdminService umsAdminService;
    @GetMapping("/login")
    @ApiOperation("登录方法")
    public Object login(){
        UmsAdmin umsAdmin = new UmsAdmin();
        umsAdmin.setUsername("admin");
        umsAdmin.setPassword("123456");
        List<UmsAdmin> umsAdmins = umsAdminService.selectByUserInfo(umsAdmin);
        return umsAdmins;
    }

    @PostMapping("/logins")
    @ApiOperation("登录方法")
    @ResponseBody
    public Object login2(@RequestBody UmsAdmin umsAdmin){
        int i = umsAdminService.selectByUserName(umsAdmin);
        if (i > 0) {
            return CommonResult.buildSucceed();
        } else {
            return CommonResult.buildFailed("账号或密码错误");
        }
    }

    @PostMapping("/postLogin/{pageSize}/{pageNum}")
    @ApiOperation("使用分頁器")
    public Object login3(@RequestBody UmsAdmin umsAdmin, @PathVariable("pageSize") String pageSize, @PathVariable ("pageNum") String pageNum) {
        System.out.println(umsAdmin);
        PageHelper.startPage(Integer.parseInt(pageNum),Integer.parseInt(pageNum));
        List<UmsAdmin> umsAdmins = umsAdminService.selectByUserInfo(umsAdmin);
        PageInfo<UmsAdmin> pageInfos = new PageInfo<>(umsAdmins);
        return pageInfos;
    }
}
