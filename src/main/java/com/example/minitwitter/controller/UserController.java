package com.example.minitwitter.controller;

import com.example.minitwitter.model.User;
import com.example.minitwitter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return userService.registerUser(user);
    }
    @PostMapping("/login")
    public User loginUser(@RequestBody User user){
        return userService.authenticateUser(user.getUsername(),user.getPassword());
    }
}
