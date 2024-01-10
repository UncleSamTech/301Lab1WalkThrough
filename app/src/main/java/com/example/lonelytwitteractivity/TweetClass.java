package com.example.lonelytwitteractivity;

import java.util.Date;

public abstract class TweetClass implements Tweetable {
    private Date date;
    private String message;

    public TweetClass(String message) {
        this.message = message;
        this.date = new Date();
    }

    public abstract Boolean isImportant();

    public TweetClass(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
