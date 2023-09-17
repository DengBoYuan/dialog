package com.dby.dialogue.mapper;

import com.dby.dialogue.entity.SessionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SessionMapper {

    public List<SessionEntity> getAllSession();

    public SessionEntity getSessionById(String id);

    public void insertSession(SessionEntity session);

    public void updateSession(SessionEntity session);

    public void deleteSessionById(String id);
}
