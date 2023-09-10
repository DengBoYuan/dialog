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

    @RequestMapping(value = "/id/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public UserEntity getUserInfoById(@PathVariable("id") String id) {
        System.out.println(id);
        return userService.getUserInfoById(id);
    }

    @RequestMapping(value = "/all", method = {RequestMethod.GET})
    @ResponseBody
    public List<UserEntity> getAllUsersInfo() {
        return userService.getAllUsersInfo();
    }
}
