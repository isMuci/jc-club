package com.jingdianjichi.oss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jingdianjichi.oss.adapter.StorageAdapter;


@Service
public class FileService {

    private final StorageAdapter storageAdapter;

    public FileService(StorageAdapter storageAdapter) {
        this.storageAdapter = storageAdapter;
    }

    /**
     * 列出所有桶
     */
    public List<String> getAllBucket() {
        return storageAdapter.getAllBucket();
    }

}
