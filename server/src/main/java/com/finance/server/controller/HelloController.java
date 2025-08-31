package com.finance.server.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/api/greet")
    public String greet() {
        return "Greetings from the spring boot application";
    }
}
