package com.example.redisspringExample.redisLearn.Model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserModel implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
}
