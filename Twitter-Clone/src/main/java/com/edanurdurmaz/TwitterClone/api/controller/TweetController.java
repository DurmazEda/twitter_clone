package com.edanurdurmaz.TwitterClone.api.controller;


import com.edanurdurmaz.TwitterClone.entities.concretes.Tweet;
import com.edanurdurmaz.TwitterClone.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tweet")
public class TweetController {
    private Tweet tweet;
    private TweetController tweetServies;

    @Autowired
    public TweetController(Tweet tweet) {
        this.tweet = tweet;
    }

    @GetMapping("/get-all")
    public List<Tweet> getAll() {
        return this.tweetServies.getAll();
    }

    @PostMapping("/add")
    public Tweet add(@RequestBody Tweet tweet){
        return this.tweetServies.add(tweet);
    }

}
