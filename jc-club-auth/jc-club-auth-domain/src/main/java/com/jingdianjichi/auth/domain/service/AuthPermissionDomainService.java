package com.jingdianjichi.auth.domain.service;

import java.util.List;

import com.jingdianjichi.auth.domain.entity.AuthPermissionBO;

/**
 * (AuthUser)表服务接口
 *
 * @author makejava
 * @since 2024-02-29 20:29:24
 */
public interface AuthPermissionDomainService {


    Boolean add(AuthPermissionBO authPermissionBO);

    Boolean update(AuthPermissionBO authPermissionBO);

    Boolean delete(AuthPermissionBO authPermissionBO);

    List<String> getPermission(String userName);
}
