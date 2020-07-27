package com.cn.course.system;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SystemApplication9001 {

    public static void main(String[] args) {

        SpringApplication.run( SystemApplication9001.class);
    }

}
