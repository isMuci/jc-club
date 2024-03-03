package com.jingdianjichi.subject.infra.basic.service;

import java.util.List;

import com.jingdianjichi.subject.infra.basic.entity.SubjectLabel;


public interface SubjectLabelService {

    /**
     * 通过ID查询单条数据
     *
     * @param id
     *            主键
     * @return 实例对象
     */
    SubjectLabel queryById(Long id);

    /**
     * 新增数据
     *
     * @param subjectLabel
     *            实例对象
     * @return 实例对象
     */
    int insert(SubjectLabel subjectLabel);

    /**
     * 修改数据
     *
     * @param subjectLabel
     *            实例对象
     * @return 实例对象
     */
    int update(SubjectLabel subjectLabel);

    /**
     * 通过主键删除数据
     *
     * @param id
     *            主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    List<SubjectLabel> batchQueryById(List<Long> labelIdList);

    List<SubjectLabel> queryByCondition(SubjectLabel subjectLabel);
}
