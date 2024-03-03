package com.jingdianjichi.auth.domain.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * (AuthPermission)实体类
 *
 * @author makejava
 * @since 2024-03-01 16:12:48
 */
@Data
public class AuthPermissionBO implements Serializable {

    private Long id;

    private String name;

    private Long parentId;

    private Integer type;

    private String menuUrl;

    private Integer status;

    private Integer show;

    private String icon;

    private String permissionKey;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 更新时间
     */
    private Date updateTime;

    private Integer isDeleted;

}

