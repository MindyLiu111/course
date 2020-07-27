package com.cn.course;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication9002 {

    public static void main(String[] args) {

        SpringApplication.run( GateWayApplication9002.class);
    }
}
