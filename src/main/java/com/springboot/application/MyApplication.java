package com.springboot.application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 
/**
 * Main implementation class which serves two purpose in a spring boot application: Configuration and bootstrapping.
 * @author Ganesh Sharma 
 */
@SpringBootApplication
public class MyApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}


