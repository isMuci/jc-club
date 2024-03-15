package com.jingdianjichi.subject.infra.basic.es;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "es.cluster")
public class EsConfigProperties {

    private List<EsClusterConfig> esConfigs = new ArrayList<>();

}
