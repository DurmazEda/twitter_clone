package com.edanurdurmaz.TwitterClone.api.controller;

import com.edanurdurmaz.TwitterClone.business.abstracts.UserServies;
import com.edanurdurmaz.TwitterClone.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UserServies userServies;

    @Autowired
    public UsersController(UserServies userServies) {
        this.userServies = userServies;
    }

    @GetMapping("/get-all")
    public List<Users> getAll() {
        return this.userServies.getAll();
    }

    @PostMapping("/add")
    public Users add(@RequestBody Users users){
        return this.userServies.add(users);
    }


}
