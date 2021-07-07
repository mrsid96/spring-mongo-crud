package com.sid.springmongocrud.service;

import com.sid.springmongocrud.model.User;
import com.sid.springmongocrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String id) {
        return userRepository.findById(id).get();
    }
}
