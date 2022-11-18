package com.howtodoinjava.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.howtodoinjava.rest.controller.CategoryController;
import com.howtodoinjava.rest.model.Category; 

@SpringBootApplication 
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
   
}
