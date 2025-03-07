package com.example.restapicall.controller;
import org.springframework.web.bind.annotation.*;
@RestController // Marks this class as a REST controller
@RequestMapping("/hello") // Base URL: http://localhost:8080/hello
public class HelloController {

    @PutMapping("/modify/{userName}")
    public String modifyWelcome(@PathVariable String userName, @RequestParam String familyName) {
        return "Hello, " + userName + " " + familyName + "! Welcome to BridgeLabz";
    }
}
