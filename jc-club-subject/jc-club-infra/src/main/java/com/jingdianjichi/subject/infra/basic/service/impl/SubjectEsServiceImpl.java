package com.jingdianjichi.subject.infra.basic.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.jingdianjichi.subject.common.entity.PageResult;
import com.jingdianjichi.subject.infra.basic.entity.EsSubjectFields;
import com.jingdianjichi.subject.infra.basic.entity.SubjectInfoEs;
import com.jingdianjichi.subject.infra.basic.es.EsIndexInfo;
import com.jingdianjichi.subject.infra.basic.es.EsRestClient;
import com.jingdianjichi.subject.infra.basic.es.EsSourceData;
import com.jingdianjichi.subject.infra.basic.service.SubjectEsService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SubjectEsServiceImpl implements SubjectEsService {
    @Override
    public boolean insert(SubjectInfoEs subjectInfoEs) {
        EsSourceData esSourceData = new EsSourceData();
        Map<String, Object> data = convertToEsSourceData(subjectInfoEs);
        esSourceData.setDocId(subjectInfoEs.getDocId().toString());
        esSourceData.setData(data);
        return EsRestClient.insertDoc(getEsIndexInfo(), esSourceData);
    }

    private Map<String, Object> convertToEsSourceData(SubjectInfoEs subjectInfoEs) {
        Map<String, Object> data = new HashMap<>();
        data.put(EsSubjectFields.SUBJECT_ID, subjectInfoEs.getSubjectId());
        data.put(EsSubjectFields.DOC_ID, subjectInfoEs.getDocId());
        data.put(EsSubjectFields.SUBJECT_NAME, subjectInfoEs.getSubjectName());
        data.put(EsSubjectFields.SUBJECT_ANSWER, subjectInfoEs.getSubjectAnswer());
        data.put(EsSubjectFields.SUBJECT_TYPE, subjectInfoEs.getSubjectType());
        data.put(EsSubjectFields.CREATE_USER, subjectInfoEs.getCreateUser());
        data.put(EsSubjectFields.CREATE_TIME, subjectInfoEs.getCreateTime());
        return data;
    }

    @Override
    public PageResult<SubjectInfoEs> querySubjectList(SubjectInfoEs subjectInfoEs) {
        return null;
    }

    private EsIndexInfo getEsIndexInfo() {
        EsIndexInfo esIndexInfo = new EsIndexInfo();
        esIndexInfo.setClusterName("0feef004fdfe");
        esIndexInfo.setIndexName("subject_index");
        return esIndexInfo;
    }
}
