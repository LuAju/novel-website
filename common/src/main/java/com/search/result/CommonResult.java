package com.search.result;

import lombok.Getter;

// 需要添加getter方法，否则不能专程json
@Getter
public class CommonResult<T> {
    private ResultCode resultCode;
    private T t;
    private String message;


    public CommonResult(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public CommonResult(ResultCode resultCode, T t, String message) {
        this.resultCode = resultCode;
        this.t = t;
        this.message = message;
    }


    public static<T> CommonResult<T> buildSucceed(T t){
        return new CommonResult<>(ResultCode.SUCCESS, t, "请求处理成功");
    }

    public static<T> CommonResult<T> buildSucceed(){
        return new CommonResult<>(ResultCode.SUCCESS, null, "请求处理成功");
    }
    public static<T> CommonResult<T> buildSucceed(String message){
        return new CommonResult<>(ResultCode.SUCCESS, null, message);
    }

    public static<T> CommonResult<T> buildFailed(T t,String message){
        return new CommonResult<T>(ResultCode.FAIL, t, message);
    }

    public static<T> CommonResult<T> buildFailed(String message){
        return new CommonResult<T>(ResultCode.FAIL, null, message);
    }

}
