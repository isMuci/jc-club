package com.jingdianjichi.subject.infra.basic.es;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.SortOrder;

import lombok.Data;

@Data
public class EsSearchRequest {
    private BoolQueryBuilder bq;
    private String[] fields;
    private int from;
    private int size;
    private Boolean needScroll;
    private Long minutes;
    private String sortName;
    private SortOrder sortOrder;
    private HighlightBuilder highlightBuilder;
}
