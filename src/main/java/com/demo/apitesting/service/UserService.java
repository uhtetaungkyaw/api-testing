package com.demo.apitesting.service;

import com.demo.apitesting.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
}
