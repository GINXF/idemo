package com.idemo.service.impl;

import com.idemo.mapper.TestMapper;
import com.idemo.entity.Test;
import com.idemo.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class TestServiceImpl implements ITestService {
    @Autowired
    private TestMapper testMapper;

    @Cacheable(cacheNames = "test")
    @Override
    public List<Test> findAll() {
        return testMapper.findAll();
    }
}
