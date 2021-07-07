package com.sid.springmongocrud.service;

import com.sid.springmongocrud.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User saveUser(User user);
    public List<User> getUsers();
    public User getUser(String id);
}
