package com.example.springboottest.dao;

import com.example.springboottest.entity.User;

public interface UserDao {

    User findById(int id);
}
