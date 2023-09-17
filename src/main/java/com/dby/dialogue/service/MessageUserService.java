package com.dby.dialogue.service;

import com.dby.dialogue.entity.MessageUserEntity;
import com.dby.dialogue.mapper.MessageUserMapper;
import com.dby.dialogue.service.Impl.MessageUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageUserService implements MessageUserServiceImpl {

    @Autowired
    MessageUserMapper messageUserMapper;

    @Override
    public List<MessageUserEntity> getAllMessageUser() {
        return messageUserMapper.getAllMessageUser();
    }

    @Override
    public MessageUserEntity getMessageUserById(String id) {
        return messageUserMapper.getMessageUserById(id);
    }

    @Override
    public void insertMessageUser(MessageUserEntity messageUser) {
        messageUser = messageUser.wrapEntity();
        messageUserMapper.insertMessageUser(messageUser);
    }

    @Override
    public void updateMessageUser(MessageUserEntity messageUser) {
        messageUserMapper.updateMessageUser(messageUser);
    }

    @Override
    public void deleteMessageUser(String id) {
        messageUserMapper.deleteMessageUser(id);
    }
}
