package com.sid.springmongocrud.controller;

import com.sid.springmongocrud.model.User;
import com.sid.springmongocrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUserList(){
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable String id){
        System.out.println("Calling this as ID ---<" + id);
        return userService.getUser(id);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

}
