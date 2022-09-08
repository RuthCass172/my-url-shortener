package com.zinkworks.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
    @GetMapping("/")
    public String greeting() {
        return "Hello World!";
    }
}
