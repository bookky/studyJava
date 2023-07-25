package com.example.wilson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.*"})
public class WilsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(WilsonApplication.class, args);
    }

}
