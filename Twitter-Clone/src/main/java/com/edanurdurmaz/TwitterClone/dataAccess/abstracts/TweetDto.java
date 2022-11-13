package com.edanurdurmaz.TwitterClone.dataAccess.abstracts;

import com.edanurdurmaz.TwitterClone.entities.concretes.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetDto extends JpaRepository<Tweet, Integer> {
}
