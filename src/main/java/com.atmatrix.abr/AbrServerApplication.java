package com.atmatrix.abr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atmatrix.abr.infrastructure.dao")
public class AbrServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbrServerApplication.class, args);
    }

}
