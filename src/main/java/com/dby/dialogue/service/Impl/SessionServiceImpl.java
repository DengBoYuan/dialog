package com.dby.dialogue.service.Impl;

import com.dby.dialogue.entity.SessionEntity;

import java.util.List;

public interface SessionServiceImpl {

    public List<SessionEntity> getAllSession();

    public SessionEntity getSessionById(String id);

    public void insertSession(SessionEntity session);

    public void updateSession(SessionEntity session);

    public void deleteSession(String id);
}
