package com.hunglp.springmybatis.controller;

import com.hunglp.springmybatis.entity.User;
import com.hunglp.springmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable long id) {
        return userMapper.getById(id);
    }

    @DeleteMapping("/users/{id}")
    public void removeUserById(@PathVariable long id) {
        userMapper.deleteUser(id);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@RequestBody User user) {
        userMapper.updateUser(user);
    }

    @PostMapping("/users")
    public void insertUser(@RequestBody User user) {
        userMapper.insertUser(user);
    }

}
