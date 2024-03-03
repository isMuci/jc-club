package com.jingdianjichi.auth.infra.basic.service;

import java.util.List;

import com.jingdianjichi.auth.infra.basic.entity.AuthPermission;

/**
 * (AuthPermission)表服务接口
 *
 * @author makejava
 * @since 2024-03-01 16:12:48
 */
public interface AuthPermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AuthPermission queryById(Long id);


    /**
     * 新增数据
     *
     * @param authPermission 实例对象
     * @return 实例对象
     */
    Integer insert(AuthPermission authPermission);

    /**
     * 修改数据
     *
     * @param authPermission 实例对象
     * @return 实例对象
     */
    Integer update(AuthPermission authPermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    List<AuthPermission> batchQueryById(List<Long> permissionIdList);
}
