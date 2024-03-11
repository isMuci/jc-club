package com.jingdianjichi.subject.domain.config;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThreadPoolConfig {
    @Bean(name = "labelThreadPool")
    public ThreadPoolExecutor getLabelThreadPool() {
        return new ThreadPoolExecutor(20, 100, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>(40),
                new CustoNameThreadFactory("label"), new ThreadPoolExecutor.CallerRunsPolicy());
    }
}
