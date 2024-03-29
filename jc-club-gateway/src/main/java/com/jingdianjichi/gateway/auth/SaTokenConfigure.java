package com.jingdianjichi.gateway.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.dev33.satoken.reactor.filter.SaReactorFilter;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;

@Configuration
public class SaTokenConfigure {
    // 注册 Sa-Token全局过滤器
    @Bean
    public SaReactorFilter getSaReactorFilter() {
        return new SaReactorFilter()
                // 拦截地址
                .addInclude("/**") /* 拦截全部path */
                // 开放地址
                // 鉴权方法：每次访问进入
                .setAuth(obj -> {
                    // 登录校验 -- 拦截所有路由，并排除/user/doLogin 用于开放登录
                    SaRouter.match("/auth/**", "/auth/user/doLogin", r -> StpUtil.checkRole("normal_user"));
                    SaRouter.match("/oss/**", r -> StpUtil.checkLogin());
                    SaRouter.match("/subject/subject/add", r -> StpUtil.checkPermission("subject:add"));
                    SaRouter.match("/subject/**", r -> StpUtil.checkLogin());

                    // 权限认证 -- 不同模块, 校验不同权限
                    // SaRouter.match("/user/**", r -> StpUtil.checkPermission("user"));
                    // SaRouter.match("/admin/**", r -> StpUtil.checkPermission("admin"));
                    // SaRouter.match("/goods/**", r -> StpUtil.checkPermission("goods"));
                    // SaRouter.match("/orders/**", r -> StpUtil.checkPermission("orders"));
                    //
                    // SaRouter.match("/user/**", r -> StpUtil.checkRole("user"));

                    // 更多匹配 ... */
                    // })
                    // // 异常处理方法：每次setAuth函数出现异常时进入
                    // .setError(e -> {
                    // return SaResult.error(e.getMessage());
                });
    }
}
