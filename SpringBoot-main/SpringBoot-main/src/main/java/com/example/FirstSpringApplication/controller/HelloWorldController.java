package com.example.FirstSpringApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  // Maps this controller to the root URL
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}