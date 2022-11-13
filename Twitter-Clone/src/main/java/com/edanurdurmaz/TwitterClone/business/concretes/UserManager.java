package com.edanurdurmaz.TwitterClone.business.concretes;

import com.edanurdurmaz.TwitterClone.business.abstracts.UserServies;
import com.edanurdurmaz.TwitterClone.dataAccess.abstracts.UsersDto;
import com.edanurdurmaz.TwitterClone.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserServies {

    private UsersDto usersDto;

    @Autowired
    public UserManager(UsersDto usersDto) {
        this.usersDto = usersDto;
    }

    @Override
    public List<Users> getAll() {
        return this.usersDto.findAll();
    }

    @Override
    public Users add(Users users) {
        return this.usersDto.save(users);
    }

}
