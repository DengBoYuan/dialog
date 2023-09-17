package com.dby.dialogue.service.Impl;


import com.dby.dialogue.entity.MessageUserEntity;

import java.util.List;

public interface MessageUserServiceImpl {

    public List<MessageUserEntity> getAllMessageUser();

    public MessageUserEntity getMessageUserById(String id);

    public void insertMessageUser(MessageUserEntity messageUser);

    public void updateMessageUser(MessageUserEntity messageUser);

    public void deleteMessageUser(String id);
}
