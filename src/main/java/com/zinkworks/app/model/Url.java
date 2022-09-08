package com.zinkworks.app.model;

import java.util.Date;

public class Url {
    private String longUrl;
    private String shortUrl;
    private Date CreatedAt;
    private Integer numOfClicks;

    public Url(String longUrl, String shortUrl, Date createdAt, Integer numOfClicks) {
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
        CreatedAt = createdAt;
        this.numOfClicks = numOfClicks;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public Integer getNumOfClicks() {
        return numOfClicks;
    }

    public void setNumOfClicks(Integer numOfClicks) {
        this.numOfClicks = numOfClicks;
    }
}
