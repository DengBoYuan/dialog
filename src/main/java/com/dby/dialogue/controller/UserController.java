package com.dby.dialogue.controller;

import com.dby.dialogue.entity.UserEntity;
import com.dby.dialogue.service.UserService;
import com.dby.dialogue.utils.Code;
import com.dby.dialogue.utils.Response;
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
    public Response getAllUsersInfo() {
        Response response = new Response();

        try {
            response.data = userService.getAllUsersInfo();
            response.code = 200;
            response.msg = "请求成功";
        } catch (Exception e) {
            e.printStackTrace();
            response.code = 10001;
            response.msg = Code.getMsg(10001);
        }
        return response;
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
