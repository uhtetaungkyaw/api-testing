package com.demo.apitesting.service.impl;

import com.demo.apitesting.entity.User;
import com.demo.apitesting.repo.UserRepo;
import com.demo.apitesting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }
}
