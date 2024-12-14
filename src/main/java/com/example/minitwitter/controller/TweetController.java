package com.example.minitwitter.controller;

import com.example.minitwitter.model.Tweet;
import com.example.minitwitter.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetController {
    @Autowired
    private TweetService tweetService;
    @PostMapping("/post")
    public Tweet postTweet(@RequestBody Tweet tweet){
        return tweetService.postTweet(tweet);
    }
    @GetMapping("/user/{userId}")
    public List<Tweet> getTweetByUserId(@PathVariable Long userId){
        return tweetService.getTweetByUserId(userId);
    }
}
