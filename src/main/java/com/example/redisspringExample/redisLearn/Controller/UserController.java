package com.example.redisspringExample.redisLearn.Controller;


import com.example.redisspringExample.redisLearn.Model.UserModel;
import com.example.redisspringExample.redisLearn.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody UserModel user) {
        boolean result = userService.saveUser(user);
        if (result)
            return ResponseEntity.ok("User Created Successfully!!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/user")
    public ResponseEntity<List<UserModel>> fetchAllUser() {
        List<UserModel> users = userService.fetchAllUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserModel> fetchUserById(@PathVariable("id") Long id) {
        UserModel user = userService.fetchUserById(id);
        return ResponseEntity.ok(user);
    }

}