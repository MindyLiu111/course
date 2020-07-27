package com.cn.course;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.cn.course.dao")
public class DemoApplication8888 {

    public static void main(String[] args) {

        SpringApplication.run( DemoApplication8888.class);
    }
}
