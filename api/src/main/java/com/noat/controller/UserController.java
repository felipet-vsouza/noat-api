package com.noat.controller;

import com.noat.business.user.UserService;
import com.noat.data.representarion.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/")
    public @ResponseBody String getUser(@RequestParam(name = "username") String username) {
        return "Hello world!";
//        return service.findUser(username).toString();
    }
}
