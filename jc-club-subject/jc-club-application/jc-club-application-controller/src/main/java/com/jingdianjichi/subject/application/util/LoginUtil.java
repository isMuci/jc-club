package com.jingdianjichi.subject.application.util;

import com.jingdianjichi.subject.application.context.LoginContextHolder;

public class LoginUtil {
    public static String getLoginId() {
        return LoginContextHolder.getLoginId();
    }
}
