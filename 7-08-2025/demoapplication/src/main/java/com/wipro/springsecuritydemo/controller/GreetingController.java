package com.wipro.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello without login!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Hello from Greet (needs login)";
    }
}
