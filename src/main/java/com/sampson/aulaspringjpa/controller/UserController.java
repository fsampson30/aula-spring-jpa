package com.sampson.aulaspringjpa.controller;

import com.sampson.aulaspringjpa.model.User;
import com.sampson.aulaspringjpa.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("users")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }
}
