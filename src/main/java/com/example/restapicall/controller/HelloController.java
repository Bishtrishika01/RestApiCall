package com.example.restapicall.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHelloDefault() {
        return "Hello from BridgeLabz!";
    }

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name + "! Welcome to BridgeLabz";
    }

    @PostMapping
    public String sayHelloPost(@RequestBody String name) {
        return "Hello, " + name + "! Welcome to BridgeLabz";
    }

    @PutMapping("/{name}")
    public String sayHelloPut(@PathVariable String name) {
        return "Updated Hello, " + name + "!";
    }

    @DeleteMapping("/{name}")
    public String sayHelloDelete(@PathVariable String name) {
        return "Goodbye, " + name + "! See you again!";
    }
}
