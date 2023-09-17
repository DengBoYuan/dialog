package com.dby.dialogue.service;

import com.dby.dialogue.entity.SessionRecordEntity;
import com.dby.dialogue.mapper.SessionRecordMapper;
import com.dby.dialogue.service.Impl.SessionRecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionRecordService implements SessionRecordServiceImpl {

    @Autowired
    SessionRecordMapper sessionRecordMapper;

    @Override
    public List<SessionRecordEntity> getAllSessionRecord() {
        return sessionRecordMapper.getAllSessionRecord();
    }

    @Override
    public SessionRecordEntity getSessionRecordById(String id) {
        return sessionRecordMapper.getSessionRecordById(id);
    }

    @Override
    public void insertSessionRecord(SessionRecordEntity sessionRecord) {
        sessionRecord = sessionRecord.wrapEntity();
        sessionRecordMapper.insertSessionRecord(sessionRecord);
    }

    @Override
    public void updateSessionRecord(SessionRecordEntity sessionRecord) {
        sessionRecordMapper.updateSessionRecord(sessionRecord);
    }

    @Override
    public void deleteSessionRecord(String id) {
        sessionRecordMapper.deleteSessionRecord(id);
    }
}
