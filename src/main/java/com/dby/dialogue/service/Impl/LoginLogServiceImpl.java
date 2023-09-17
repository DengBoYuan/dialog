package com.dby.dialogue.service.Impl;

import com.dby.dialogue.entity.LoginLogEntity;

import java.util.List;

public interface LoginLogServiceImpl {

    public List<LoginLogEntity> getAllLoginLog();

    public LoginLogEntity getLoginLogById(String id);

    public void insertLoginLog(LoginLogEntity loginLog);

    public void updateLoginLog(LoginLogEntity loginLog);

    public void deleteLoginLog(String id);

}
