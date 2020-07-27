package com.cn.course.dao;

import com.cn.course.pojo.TbDemo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


@org.apache.ibatis.annotations.Mapper
public interface DemoMapper extends Mapper<TbDemo> {


    List<TbDemo> findAll();
}
