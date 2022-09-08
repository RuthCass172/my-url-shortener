package com.zinkworks.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Url {
    private String longUrl;
    @Id
    private String shortUrl;
    private Date createdAt;
    private Integer numOfClicks;

    public Url(String longUrl, String shortUrl, Date createdAt, Integer numOfClicks) {
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
        this.createdAt = createdAt;
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
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getNumOfClicks() {
        return numOfClicks;
    }

    public void setNumOfClicks(Integer numOfClicks) {
        this.numOfClicks = numOfClicks;
    }
}
