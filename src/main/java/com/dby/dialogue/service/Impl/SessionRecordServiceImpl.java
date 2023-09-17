package com.dby.dialogue.service.Impl;

import com.dby.dialogue.entity.SessionRecordEntity;

import java.util.List;

public interface SessionRecordServiceImpl {
    public List<SessionRecordEntity> getAllSessionRecord();

    public SessionRecordEntity getSessionRecordById(String id);

    public void insertSessionRecord(SessionRecordEntity sessionRecord);

    public void updateSessionRecord(SessionRecordEntity sessionRecord);

    public void deleteSessionRecord(String id);
}
