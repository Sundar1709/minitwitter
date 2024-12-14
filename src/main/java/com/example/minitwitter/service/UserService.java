package com.example.minitwitter.service;

import com.example.minitwitter.model.User;
import com.example.minitwitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User registerUser(User user){
        return userRepository.save(user);
    }
    public User authenticateUser(String username,String password){
        User user=userRepository.findByUsername(username);
        if( user!=null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}