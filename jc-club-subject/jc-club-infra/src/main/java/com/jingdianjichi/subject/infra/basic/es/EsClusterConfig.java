package com.jingdianjichi.subject.infra.basic.es;

import lombok.Data;

@Data
public class EsClusterConfig {

    private String name;

    private String nodes;
}
