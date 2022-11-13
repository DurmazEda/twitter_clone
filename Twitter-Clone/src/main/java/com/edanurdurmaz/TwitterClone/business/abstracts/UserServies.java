package com.edanurdurmaz.TwitterClone.business.abstracts;

import com.edanurdurmaz.TwitterClone.entities.concretes.Users;

import java.util.List;

public interface UserServies {
    List<Users> getAll();
    Users add(Users users);


}
