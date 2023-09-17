package com.dby.dialogue.mapper;

import com.dby.dialogue.entity.LoginLogEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginLogMapper {

    public List<LoginLogEntity> getAllLoginLog();

    public LoginLogEntity getLoginLogById(String id);

    public void insertLoginLog(LoginLogEntity loginLog);

    public void updateLoginLog(LoginLogEntity loginLog);

    public void deleteLoginLog(String id);

}
