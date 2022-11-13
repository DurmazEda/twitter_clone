package com.edanurdurmaz.TwitterClone.entities.concretes;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@Table(name="tweet")
public class Tweet {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="tweettext")
    private String tweetText;

    @Column(name="created_time")
    private Date createdTime;

    @Column(name="iisreply")
    private boolean isReply;

    @Column(name="replies")
    private int replies;

    @Column(name="child")
    private int child;

    @Column(name="parent")
    private int parent;

    @Column(name="author")
    private int author;

    @Column(name="likedusers")
    private int likedUsers;

    @Column(name="retweeters")
    private int reTweeters;
}
