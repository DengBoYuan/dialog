package com.dby.dialogue.controller;

import com.dby.dialogue.entity.MessageUserEntity;
import com.dby.dialogue.service.MessageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messageUser")
public class MessageUserController {

    @Autowired
    MessageUserService messageUserService;

    @GetMapping("/all")
    public List<MessageUserEntity> getAllMessageUser() {
        return messageUserService.getAllMessageUser();
    }

    @GetMapping("/id/{id}")
    public MessageUserEntity getMessageUserById(@PathVariable("id") String id) {
        return messageUserService.getMessageUserById(id);
    }

    @PostMapping("/insert")
    public void insertMessageUser(@RequestBody MessageUserEntity messageUser) {
        messageUserService.insertMessageUser(messageUser);
    }

    @PostMapping("/update")
    public void updateMessageUser(@RequestBody MessageUserEntity messageUser) {
        messageUserService.updateMessageUser(messageUser);
    }

    @GetMapping("/delete/{id}")
    public void deleteMessageUser(@PathVariable("id") String id) {
        messageUserService.deleteMessageUser(id);
    }
}
