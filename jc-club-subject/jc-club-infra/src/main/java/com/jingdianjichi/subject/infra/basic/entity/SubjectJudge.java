package com.jingdianjichi.subject.infra.basic.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class SubjectJudge implements Serializable {
    private static final long serialVersionUID = 725783721496341698L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 题目id
     */
    private Long subjectId;
    /**
     * 是否正确
     */
    private Integer isCorrect;
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
