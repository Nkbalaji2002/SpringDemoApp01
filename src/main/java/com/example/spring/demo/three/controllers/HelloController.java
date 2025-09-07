package com.example.spring.demo.three.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello World from Spring Boot App!!!";
    }
}
