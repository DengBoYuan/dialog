package com.dby.dialogue.mapper;

import com.dby.dialogue.entity.SessionRecordEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SessionRecordMapper {
    public List<SessionRecordEntity> getAllSessionRecord();

    public SessionRecordEntity getSessionRecordById(String id);

    public void insertSessionRecord(SessionRecordEntity sessionRecord);

    public void updateSessionRecord(SessionRecordEntity sessionRecord);

    public void deleteSessionRecord(String id);
}
