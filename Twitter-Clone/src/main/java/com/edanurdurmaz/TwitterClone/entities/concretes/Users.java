package com.edanurdurmaz.TwitterClone.entities.concretes;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    @Column(name="website")
    private String website;

    @Column(name="location")
    private String location;

    @Column(name="created_time")
    private Date createdTime;

    @Column(name="updated_time")
    private Date updatedTime;

    @Column(name="followuser")
    private int followUser;

    @Column(name="follower")
    private int follower;

    @Column(name="likedtweets")
    private int likedTweets;

    @Column(name="tweets")
    private int tweets;

    @Column(name="bookmarks")
    private int bookmarks;
}
