package com.example.sifarisservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SifarisServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SifarisServiceApplication.class, args);
    }

}
