package com.jingdianjichi.subject.infra.basic.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;


@Data
public class SubjectLabel implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 标签分类
     */
    private String labelName;

    private Long categoryId;
    /**
     * 排序
     */
    private Integer sortNum;
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

    private Integer isDeleted;
    /**
     * 更新时间
     */
    private Date updateTime;

}
