package com.example.demo.countdownlatch.thread;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/4/10
 * Time:14:22
 */
public class Request {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
