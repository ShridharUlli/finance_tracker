package com.finance.server.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/api/greet")
    public String greet() {
        return "Hi from /api/greet";
    }
}
