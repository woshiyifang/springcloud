package com.duyf.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.duyf.springcloud.mapper")
public class PayMent8001 {
    public static void main(String[] args) {
        SpringApplication.run(PayMent8001.class, args);
    }
}

