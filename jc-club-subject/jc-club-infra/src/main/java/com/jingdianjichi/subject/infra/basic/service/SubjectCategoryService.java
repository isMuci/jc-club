package com.jingdianjichi.subject.infra.basic.service;

import java.util.List;

import com.jingdianjichi.subject.infra.basic.entity.SubjectCategory;


public interface SubjectCategoryService {

    SubjectCategory insert(SubjectCategory subjectCategory);

    /**
     * 通过ID查询单条数据
     *
     * @param id
     *            主键
     * @return 实例对象
     */
    SubjectCategory queryById(Long id);

    /**
     * 修改数据
     *
     * @param subjectCategory
     *            实例对象
     * @return 实例对象
     */
    int update(SubjectCategory subjectCategory);

    /**
     * 通过主键删除数据
     *
     * @param id
     *            主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 查询岗位大类
     */
    List<SubjectCategory> queryCategory(SubjectCategory subjectCategory);

}
