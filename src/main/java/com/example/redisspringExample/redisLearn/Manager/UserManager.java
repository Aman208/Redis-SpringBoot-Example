package com.example.redisspringExample.redisLearn.Manager;
import com.example.redisspringExample.redisLearn.Model.UserModel;

import java.util.List;

public interface UserManager {

    boolean saveUser(UserModel user);
    List<UserModel> fetchAllUser();
    UserModel fetchUserById(Long id);
}
