package com.dby.dialogue.mapper;

import com.dby.dialogue.entity.MessageEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    public List<MessageEntity> getAllMessage();

    public MessageEntity getMessageById(String id);

    public void insertMessage(MessageEntity message);

    public void updateMessage(MessageEntity message);

    public void deleteMessageById(String id);
}
