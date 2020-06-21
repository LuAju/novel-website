package com.search.result;

public enum ResultCode {
    SUCCESS(0,"请求处理成功"),
    FAIL(-1,"请求处理失败");


    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
