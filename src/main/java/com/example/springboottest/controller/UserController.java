package com.example.springboottest.controller;

import com.example.springboottest.entity.User;
import com.example.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserById")
    public User getUserById(int id){
        return userService.getUserById(id);
    }

    @RequestMapping("test")
    public String test(){
        return "Success!!!";
    }
}
