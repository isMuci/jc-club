package com.jingdianjichi.subject.domain.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class SubjectOptionBO implements Serializable {

    /**
     * 题目答案
     */
    private String subjectAnswer;

    /**
     * 答案选项
     */
    private List<SubjectAnswerBO> optionList;

}
