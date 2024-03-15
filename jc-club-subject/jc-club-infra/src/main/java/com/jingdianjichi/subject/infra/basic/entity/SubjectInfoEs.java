package com.jingdianjichi.subject.infra.basic.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.jingdianjichi.subject.common.entity.PageInfo;

import lombok.Data;

@Data
public class SubjectInfoEs extends PageInfo implements Serializable {
    private Long subjectId;
    private Long docId;
    private String subjectName;
    private String subjectAnswer;
    private String createUser;
    private Long createTime;
    private Integer subjectType;
    private String keyWord;
    private BigDecimal score;
}
