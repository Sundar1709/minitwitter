package com.example.minitwitter.repository;

import com.example.minitwitter.model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet,Long> {
    List<Tweet> findByUserId(Long userId);
}