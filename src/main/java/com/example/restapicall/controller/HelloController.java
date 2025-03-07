package com.example.restapicall.controller;
import org.springframework.web.bind.annotation.*;
import com.example.restapicall.bean.User;
@RestController // Marks this class as a REST controller
@RequestMapping("/hello") // Base URL: http://localhost:8080/hello
public class HelloController {

    // POST request that accepts firstName and lastName in the request body
    @PostMapping("/post")
    public String greetUser(@RequestBody User user) {
        return "Hello, " + user.getFirstName() + " " + user.getLastName() + "! Welcome to BridgeLabz";
    }
}
