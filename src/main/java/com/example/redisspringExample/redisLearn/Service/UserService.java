package com.example.redisspringExample.redisLearn.Service;

import com.example.redisspringExample.redisLearn.Model.UserModel;

import java.util.List;

public interface UserService {

    boolean saveUser(UserModel user);
    List<UserModel> fetchAllUser();
    UserModel fetchUserById(Long id);


}
