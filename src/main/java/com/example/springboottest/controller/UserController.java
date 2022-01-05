package com.example.springboottest.controller;

import com.example.springboottest.entity.User;
import com.example.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping("add")
    public String add(@RequestBody User user){
        int isSuc = userService.insert(user);
        if (isSuc>0){
            return "success!";
        }
        return "fail to insert!";
    }

    @RequestMapping("branchDevTest")
    public String testBranch(){
        return "submit to dev branch!!!@@!!!";
    }
}
