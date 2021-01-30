package com.example.redisspringExample.redisLearn.Service;

import com.example.redisspringExample.redisLearn.Manager.UserManager;
import com.example.redisspringExample.redisLearn.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserManager userManager;

    @Override
    public boolean saveUser(UserModel user) {
        return userManager.saveUser(user);
    }

    @Override
    public List<UserModel> fetchAllUser() {
        return userManager.fetchAllUser();
    }

    @Override
    public UserModel fetchUserById(Long id) {
        return userManager.fetchUserById(id);
    }

}
