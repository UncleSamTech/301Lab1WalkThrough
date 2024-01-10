package com.example.lonelytwitteractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<TweetClass> tweetList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tweetList = new ArrayList<>();
        tweetList.add(new NormalTweetClass("This is a normal tweet"));
        tweetList.add(new ImportantTweetClass("This is an important tweet"));

    }

    //TweetClass tweetClass = new TweetClass("This is a simple tweet");
}