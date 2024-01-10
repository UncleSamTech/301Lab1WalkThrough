package com.example.lonelytwitteractivity;

import java.util.Date;

public class ImportantTweetClass extends TweetClass{

    public ImportantTweetClass(String message) {
        super(message);
    }

    @Override
    public Date getDate() {
        return super.getDate();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    public ImportantTweetClass(Date date, String message) {
        super(date, message);
    }
}
