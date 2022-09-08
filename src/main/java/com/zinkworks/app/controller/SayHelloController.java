package com.zinkworks.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zinkworks.app.service.UrlService;

@RestController
public class SayHelloController {
    private UrlService urlService;
    @GetMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @PostMapping("short-url")
    public String createShortUrl() {
        return urlService.createShortUrl("www.google.ie");
    }
}
