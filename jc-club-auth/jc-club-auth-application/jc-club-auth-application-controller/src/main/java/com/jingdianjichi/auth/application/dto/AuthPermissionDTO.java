package com.jingdianjichi.auth.application.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * (AuthPermission)实体类
 *
 * @author makejava
 * @since 2024-03-01 16:12:48
 */
@Data
public class AuthPermissionDTO implements Serializable {

    private Long id;

    private String name;

    private Long parentId;

    private Integer type;

    private String menuUrl;

    private Integer status;

    private Integer show;

    private String icon;

    private String permissionKey;

}

