package com.jingdianjichi.subject.application.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;

import com.jingdianjichi.subject.common.context.LoginContextHolder;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String loginId = request.getHeader("loginId");
        LoginContextHolder.set("loginId", loginId);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                @Nullable Exception ex) throws Exception {
        LoginContextHolder.remove();
    }
}
