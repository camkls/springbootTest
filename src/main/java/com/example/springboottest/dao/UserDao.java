package com.example.springboottest.dao;

import com.example.springboottest.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    User findById(int id);

    List<User> findAll();

    int  insert(User user);
}
