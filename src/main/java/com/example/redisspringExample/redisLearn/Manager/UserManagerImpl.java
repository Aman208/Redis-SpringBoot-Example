package com.example.redisspringExample.redisLearn.Manager;

import com.example.redisspringExample.redisLearn.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserManagerImpl implements UserManager {

    @Autowired
    private RedisTemplate redisTemplategit;



    private static final String KEY = "USER";

    @Override
    public boolean saveUser(UserModel user) {
        try {
            redisTemplate.opsForHash().put(KEY, user.getId().toString(), user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<UserModel> fetchAllUser() {
        List<UserModel> users;
        users = redisTemplate.opsForHash().values(KEY);
        return  users;
    }

    @Override
    public UserModel fetchUserById(Long id) {
        UserModel user;
        user = (UserModel) redisTemplate.opsForHash().get(KEY,id.toString());
        return user;
    }


}
