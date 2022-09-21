package com.zinkworks.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Url {
    @Column(name = "LONGURL")
    private String longUrl;
    @Id
    @Column(name = "SHORTURL")
    private String shortUrl;
    @Column(name = "NUMOFCLICKS")
    private Integer numOfClicks;

    public Url() {}

    public Url(String longUrl, String shortUrl, Integer numOfClicks) {
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
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

    public Integer getNumOfClicks() {
        return numOfClicks;
    }

    public void setNumOfClicks(Integer numOfClicks) {
        this.numOfClicks = numOfClicks;
    }
}
