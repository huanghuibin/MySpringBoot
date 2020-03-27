package com.example.demo.sys.outh2;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/27
 * Time:14:59
 */
public class OAuth2Token implements AuthenticationToken {


    private String token;

    public OAuth2Token(String token){
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
