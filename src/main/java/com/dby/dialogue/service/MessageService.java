package com.dby.dialogue.service;

import com.dby.dialogue.entity.MessageEntity;
import com.dby.dialogue.mapper.MessageMapper;
import com.dby.dialogue.service.Impl.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService implements MessageServiceImpl {

    @Autowired
    MessageMapper messageMapper;

    @Override
    public List<MessageEntity> getAllMessage() {
        return messageMapper.getAllMessage();
    }

    @Override
    public MessageEntity getMessageById(String id) {
        return messageMapper.getMessageById(id);
    }

    @Override
    public void insertMessage(MessageEntity message) {
        message = message.wrapEntity();
        messageMapper.insertMessage(message);
    }

    @Override
    public void updateMessage(MessageEntity message) {
        messageMapper.updateMessage(message);
    }

    @Override
    public void deleteMessageById(String id) {
        messageMapper.deleteMessageById(id);
    }
}
