package com.JavaProject.BackendApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String sayHello(){
        return "Hello, Spring Boot is working! v3";
    }
}
