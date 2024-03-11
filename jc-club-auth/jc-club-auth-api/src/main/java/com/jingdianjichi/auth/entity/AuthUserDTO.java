package com.jingdianjichi.auth.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * (AuthUser)实体类
 *
 * @author makejava
 * @since 2024-02-29 20:29:23
 */
@Data
public class AuthUserDTO implements Serializable {
    private static final long serialVersionUID = -92677392610668437L;

    private Long id;

    private String userName;

    private String nickName;

    private String email;

    private String phone;

    private String password;

    private Integer sex;

    private String avatar;

    private Integer status;

    private String introduce;

    private String extJson;
}

