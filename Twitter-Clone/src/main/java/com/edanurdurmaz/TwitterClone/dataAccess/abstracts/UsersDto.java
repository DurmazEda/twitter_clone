package com.edanurdurmaz.TwitterClone.dataAccess.abstracts;

import com.edanurdurmaz.TwitterClone.entities.concretes.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDto extends JpaRepository<Users, Integer> {
}
