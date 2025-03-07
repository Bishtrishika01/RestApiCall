package com.example.restapicall.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet") // Base URL: http://localhost:8081/greet
public class HelloController {

    @GetMapping("/query")
    public String greetUser(@RequestParam String name) {
        return "Hello, " + name + "! Welcome to BridgeLabz";
    }
}
