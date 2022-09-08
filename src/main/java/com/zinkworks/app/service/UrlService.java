package com.zinkworks.app.service;

import com.zinkworks.app.model.Url;
import com.zinkworks.app.repository.UrlRepository;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    private UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public static String createShortUrl(String longUrl) {
        return "Short Url Created";
    }
}
