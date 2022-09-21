package com.zinkworks.app.service;

import com.zinkworks.app.model.Url;
import com.zinkworks.app.repository.UrlRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UrlService {
    private static UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        UrlService.urlRepository = urlRepository;
    }

    public static String createShortUrl(String longUrl) {
        return "Short Url Created";
    }

    public static String redirectShortUrl(String shortUrl) {
        Optional<Url> url = urlRepository.findById(shortUrl);
        if (url.isPresent()) {
            String longUrl = url.get().getLongUrl();
            return longUrl;//.matches("^(https?)://.*$") ? longUrl : String.format("https://%s", longUrl);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Url was not found");
    }
}
