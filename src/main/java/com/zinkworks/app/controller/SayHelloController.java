package com.zinkworks.app.controller;

import org.springframework.web.bind.annotation.*;
import com.zinkworks.app.service.UrlService;

@RestController
public class SayHelloController {
    private UrlService urlService;

    @GetMapping("/")
    public String homePage() {
        return "Welcome to my Url Shortener";
    }

    @GetMapping("/{shortUrl}")
    public String redirectToLongUrl(@PathVariable String shortUrl) {
        shortUrl = "www.zinkworks.com";
        return shortUrl;
    }

    @PostMapping("short-url")
    public String createShortUrl() {
        return urlService.createShortUrl("www.google.ie");
    }
}
