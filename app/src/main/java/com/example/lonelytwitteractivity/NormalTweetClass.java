package com.example.lonelytwitteractivity;

import java.util.Date;

public class NormalTweetClass extends TweetClass{
    public NormalTweetClass(String message) {
        super(message);
    }

    public NormalTweetClass(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
