package com.jingdianjichi.subject.common.util;


import com.jingdianjichi.subject.common.context.LoginContextHolder;

public class LoginUtil {
    public static String getLoginId() {
        return LoginContextHolder.getLoginId();
    }
}
