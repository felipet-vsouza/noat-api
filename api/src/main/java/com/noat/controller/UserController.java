package com.noat.controller;

import com.noat.business.user.UserService;
import com.noat.data.representarion.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user/{username}")
    public User getUser(@PathVariable String username) {
        return service.findUser(username);
    }
}
