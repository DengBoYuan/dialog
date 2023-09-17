package com.dby.dialogue.service.Impl;

import com.dby.dialogue.entity.MessageEntity;

import java.util.List;

public interface MessageServiceImpl {

    public List<MessageEntity> getAllMessage();

    public MessageEntity getMessageById(String id);

    public void insertMessage(MessageEntity message);

    public void updateMessage(MessageEntity message);

    public void deleteMessageById(String id);
}
