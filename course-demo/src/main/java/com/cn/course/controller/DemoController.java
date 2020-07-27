package com.cn.course.controller;

import com.cn.course.pojo.TbDemo;
import com.cn.course.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("demo")
@CrossOrigin
public class DemoController {

    @Autowired
    private DemoService demoService;


    @GetMapping
    public  String  Hello(){

         List<TbDemo> demos = demoService.findAll();
          return  "Hello....等到数据库记录："+demos;
    }
}
