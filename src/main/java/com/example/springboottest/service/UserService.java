package com.example.springboottest.service;

import com.example.springboottest.dao.UserDao;
import com.example.springboottest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(int id){
        return userDao.findById(id);
    }

    public List<User> getUsers(){
        return userDao.findAll();
    }

    public int  insert(User user){
        return userDao.insert(user);
    }
}
