package com.cn.course.service.impl;

import com.cn.course.dao.DemoMapper;
import com.cn.course.pojo.TbDemo;
import com.cn.course.service.DemoService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;


    @Override
    public List<TbDemo> findAll() {
        return demoMapper.findAll();
    }
}
