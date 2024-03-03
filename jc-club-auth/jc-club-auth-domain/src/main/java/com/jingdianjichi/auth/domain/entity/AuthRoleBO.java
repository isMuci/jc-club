package com.jingdianjichi.auth.domain.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * (AuthRole)实体类
 *
 * @author makejava
 * @since 2024-03-01 11:17:38
 */
@Data
public class AuthRoleBO implements Serializable {
    private static final long serialVersionUID = -67878068461424684L;

    private Long id;

    private String roleName;

    private String roleKey;


}

