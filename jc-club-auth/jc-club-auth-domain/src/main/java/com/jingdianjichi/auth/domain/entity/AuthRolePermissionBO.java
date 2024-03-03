package com.jingdianjichi.auth.domain.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * (AuthRolePermission)实体类
 *
 * @author makejava
 * @since 2024-03-01 17:12:49
 */
@Data
public class AuthRolePermissionBO implements Serializable {

    private Long id;

    private Long roleId;

    private Long permissionId;
    private List<Integer> permissionIdList;
}

