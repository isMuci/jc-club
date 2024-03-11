package com.jingdianjichi.subject.domain.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

@Component
public class CacheUtil<K, V> {

    private Cache<String, String> localCache = CacheBuilder.newBuilder().maximumSize(5000).expireAfterWrite(10, TimeUnit.SECONDS).build();

    public List<V> getResult(String cacheKey, Class<V> vClass, Function<String, List<V>> function) {
        List<V> resultList;
        String content = localCache.getIfPresent(cacheKey);
        if (StringUtils.isBlank(content)) {
            resultList = function.apply(cacheKey);
            if (!CollectionUtils.isEmpty(resultList)) {
                localCache.put(cacheKey, JSON.toJSONString(resultList));
            }
        } else {
            resultList = JSON.parseArray(content, vClass);
        }
        return resultList;
    }

    public Map<K, V> getMapResult(String cacheKey, Class<V> vClass, Function<String, Map<K, V>> function) {

        return new HashMap<>();
    }
}
