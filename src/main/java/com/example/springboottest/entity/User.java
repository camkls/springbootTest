package com.example.springboottest.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(prefix = "x")
public class User {
    private int xId;
    private String xName;
    private String xBirthday;

}
