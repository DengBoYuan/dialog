package com.dby.dialogue.controller;


import com.dby.dialogue.entity.MessageEntity;
import com.dby.dialogue.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MseeageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/all")
    public List<MessageEntity> getAllMessage() {
        return messageService.getAllMessage();
    }

    @GetMapping("/id/{id}")
    public MessageEntity getMessageById(@PathVariable("id") String id) {
        return messageService.getMessageById(id);
    }

    @PostMapping("/insert")
    public void insertMessage(@RequestBody MessageEntity message) {
        messageService.insertMessage(message);
    }

    @PostMapping("/update")
    public void updateMessage(@RequestBody MessageEntity message) {
        messageService.updateMessage(message);
    }

    @GetMapping("/delete/{id}")
    public void deleteMessage(@PathVariable("id") String id) {
        messageService.deleteMessageById(id);
    }
}
