package com.dby.dialogue.service;

import com.dby.dialogue.entity.SessionEntity;
import com.dby.dialogue.mapper.SessionMapper;
import com.dby.dialogue.service.Impl.SessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService implements SessionServiceImpl {

    @Autowired
    SessionMapper sessionMapper;

    @Override
    public List<SessionEntity> getAllSession() {
        return sessionMapper.getAllSession();
    }

    @Override
    public SessionEntity getSessionById(String id) {
        return sessionMapper.getSessionById(id);
    }

    @Override
    public void insertSession(SessionEntity session) {
        session = session.wrapEntity();
        sessionMapper.insertSession(session);
    }

    @Override
    public void updateSession(SessionEntity session) {
        sessionMapper.updateSession(session);
    }

    @Override
    public void deleteSession(String id) {
        sessionMapper.deleteSessionById(id);
    }
}
