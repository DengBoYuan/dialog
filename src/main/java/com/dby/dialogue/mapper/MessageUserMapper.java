package com.dby.dialogue.mapper;

import com.dby.dialogue.entity.MessageUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageUserMapper {

    public List<MessageUserEntity> getAllMessageUser();

    public MessageUserEntity getMessageUserById(String id);

    public void insertMessageUser(MessageUserEntity messageUser);

    public void updateMessageUser(MessageUserEntity messageUser);

    public void deleteMessageUser(String id);
}
