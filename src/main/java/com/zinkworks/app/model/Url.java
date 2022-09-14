package com.zinkworks.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Url {
    @Column
    private String LONGURL;
    @Id
    private String SHORTURL;
    @Column
    private Integer NUMOFCLICKS;

    public Url(String longUrl, String shortUrl, Integer numOfClicks) {
        this.LONGURL = longUrl;
        this.SHORTURL = shortUrl;
        this.NUMOFCLICKS = numOfClicks;
    }

    public String getLongUrl() {
        return LONGURL;
    }

    public void setLongUrl(String longUrl) {
        this.LONGURL = longUrl;
    }

    public String getShortUrl() {
        return SHORTURL;
    }

    public void setShortUrl(String shortUrl) {
        this.SHORTURL = shortUrl;
    }

    public Integer getNumOfClicks() {
        return NUMOFCLICKS;
    }

    public void setNumOfClicks(Integer numOfClicks) {
        this.NUMOFCLICKS = numOfClicks;
    }
}
