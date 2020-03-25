package com.example.demo.exception;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/6
 * Time:17:11
 */
public class CommonException extends RuntimeException {

    private int code;
    private String msg;


    public CommonException() {
        super();
    }

    public CommonException(String message) {
        super(message);
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommonException(Throwable cause) {
        super(cause);
    }

    public CommonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CommonException(int code, String msg) {
        super(code + ":" + msg);
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
