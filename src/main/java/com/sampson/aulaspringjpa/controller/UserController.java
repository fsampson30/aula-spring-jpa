package com.sampson.aulaspringjpa.controller;

import com.sampson.aulaspringjpa.model.User;
import com.sampson.aulaspringjpa.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list-users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
