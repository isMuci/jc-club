package com.jingdianjichi.subject.infra.basic.service;

import java.util.List;

import com.jingdianjichi.subject.infra.basic.entity.SubjectRadio;

public interface SubjectRadioService {

    /**
     * 通过ID查询单条数据
     *
     * @param id
     *            主键
     * @return 实例对象
     */
    SubjectRadio queryById(Long id);

    /**
     * 新增数据
     *
     * @param subjectRadio
     *            实例对象
     * @return 实例对象
     */
    SubjectRadio insert(SubjectRadio subjectRadio);

    /**
     * 批量插入
     */
    void batchInsert(List<SubjectRadio> subjectRadioList);

    /**
     * 修改数据
     *
     * @param subjectRadio
     *            实例对象
     * @return 实例对象
     */
    SubjectRadio update(SubjectRadio subjectRadio);

    /**
     * 通过主键删除数据
     *
     * @param id
     *            主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    List<SubjectRadio> queryByCondition(SubjectRadio subjectRadio);

}
