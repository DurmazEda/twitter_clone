package com.edanurdurmaz.TwitterClone.business.abstracts;


import com.edanurdurmaz.TwitterClone.entities.concretes.Tweet;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TweetServices {

    List<Tweet> getall();

    Tweet add(Tweet tweet);
}
