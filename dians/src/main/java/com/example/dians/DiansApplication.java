package com.example.dians;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")


public class DiansApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiansApplication.class, args);
    }

}
