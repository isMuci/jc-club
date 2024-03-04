package com.jingdianjichi.auth.domain.service;

import com.jingdianjichi.auth.domain.entity.AuthUserBO;

import cn.dev33.satoken.stp.SaTokenInfo;

/**
 * (AuthUser)表服务接口
 *
 * @author makejava
 * @since 2024-02-29 20:29:24
 */
public interface AuthUserDomainService {


    Boolean register(AuthUserBO authUserBO);

    Boolean update(AuthUserBO authUserBO);

    Boolean delete(AuthUserBO authUserBO);

    SaTokenInfo doLogin(String validCode);

    AuthUserBO getUserInfo(AuthUserBO authUserBO);
}
