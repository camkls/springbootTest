package com.example.springboottest.controller;

import com.example.springboottest.entity.User;
import com.example.springboottest.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    //http://localhost:8888/saveCity?cityName=北京&cityIntroduce=中国首都&cityId=1
    @GetMapping(value = "saveCity")
    public String saveCity(int cityId, String cityName, String cityIntroduce) {
        User user = new User();
        redisService.set(cityId + "", user);
        return "success";
    }

    //http://localhost:8888/getCityById?cityId=1
    @GetMapping(value = "getCityById")
    public User getCity(String cityId) {
        User user = new User();
        return user;
    }
}
