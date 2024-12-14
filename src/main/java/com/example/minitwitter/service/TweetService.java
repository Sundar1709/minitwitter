package com.example.minitwitter.service;

import com.example.minitwitter.model.Tweet;
import com.example.minitwitter.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {
    @Autowired
    private TweetRepository tweetRepository;
    public Tweet postTweet(Tweet tweet){
        return tweetRepository.save(tweet);
    }
    public List<Tweet> getTweetByUserId(Long userId){
        return tweetRepository.findByUserId(userId);
    }

}
