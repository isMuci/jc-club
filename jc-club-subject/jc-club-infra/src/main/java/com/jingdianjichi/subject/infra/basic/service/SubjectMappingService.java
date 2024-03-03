package com.jingdianjichi.subject.infra.basic.service;

import java.util.List;

import com.jingdianjichi.subject.infra.basic.entity.SubjectMapping;


public interface SubjectMappingService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    SubjectMapping queryById(int id);

    /**
     * 新增数据
     *
     * @param subjectMapping
     *            实例对象
     * @return 实例对象
     */
    SubjectMapping insert(SubjectMapping subjectMapping);

    /**
     * 修改数据
     *
     * @param subjectMapping
     *            实例对象
     * @return 实例对象
     */
    int update(SubjectMapping subjectMapping);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    boolean deleteById(int id);

    /**
     * 查询标签id
     */
    List<SubjectMapping> queryLabelId(SubjectMapping subjectMapping);

    /**
     * 批量插入
     */
    void batchInsert(List<SubjectMapping> mappingList);

}
