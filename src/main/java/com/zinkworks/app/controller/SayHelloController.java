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

    @GetMapping("redirect/{shortUrl}")
    public String redirectToLongUrl(@PathVariable String shortUrl) {
        return urlService.redirectShortUrl(shortUrl);
    }

    @PostMapping("short-url")
    public String createShortUrl() {
        return urlService.createShortUrl("www.google.ie");
    }
}