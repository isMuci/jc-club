package com.jingdianjichi.subject.infra.basic.es;

import java.util.Map;

import lombok.Data;

@Data
public class EsSourceData {

    private String docId;

    private Map<String, Object> data;
}
