package com.jingdianjichi.subject.infra.basic.es;

import java.io.Serializable;

import lombok.Data;

@Data
public class EsIndexInfo implements Serializable {

    private String clusterName;

    private String indexName;
}
