package com.dby.dialogue.controller;

import com.dby.dialogue.entity.UserEntity;
import com.dby.dialogue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/id/{id}")
    public UserEntity getUserInfoById(@PathVariable("id") String id) {
        return userService.getUserInfoById(id);
    }

    @GetMapping("/all")
    public List<UserEntity> getAllUsersInfo() {
        return userService.getAllUsersInfo();
    }

    @GetMapping("/name/{name}")
    public UserEntity getUserInfoByName(@PathVariable("name") String userName) {
        return userService.getUserInfoByUserName(userName);
    }

    @PostMapping("/insert")
    public void insertUser(@RequestBody UserEntity user) {
        user = user.WrapEntity();
        userService.insertUser(user);
    }

    @PostMapping("/update")
    public void updateUser(@RequestBody UserEntity user) {
        userService.updateUser(user);
    }

    @GetMapping("/delete/{id}")
    public void deleteUserById(@PathVariable("id") String id) {
        userService.deleteUserById(id);
    }
}
