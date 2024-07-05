package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        System.setProperty("server.port", "5000");
        SpringApplication.run(MainApplication.class, args);
    }
}