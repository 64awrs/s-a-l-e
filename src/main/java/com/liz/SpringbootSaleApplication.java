package com.liz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liz.mapper")
public class SpringbootSaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSaleApplication.class, args);
    }

}
