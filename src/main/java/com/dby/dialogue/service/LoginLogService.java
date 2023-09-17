package com.dby.dialogue.service;

import com.dby.dialogue.entity.LoginLogEntity;
import com.dby.dialogue.mapper.LoginLogMapper;
import com.dby.dialogue.service.Impl.LoginLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginLogService implements LoginLogServiceImpl {

    @Autowired
    LoginLogMapper loginLogMapper;

    @Override
    public List<LoginLogEntity> getAllLoginLog() {
        return loginLogMapper.getAllLoginLog();
    }

    @Override
    public LoginLogEntity getLoginLogById(String id) {
        return loginLogMapper.getLoginLogById(id);
    }

    @Override
    public void insertLoginLog(LoginLogEntity loginLog) {
        loginLog = loginLog.wrapEntity();
        loginLogMapper.insertLoginLog(loginLog);
    }

    @Override
    public void updateLoginLog(LoginLogEntity loginLog) {
        loginLogMapper.updateLoginLog(loginLog);
    }

    @Override
    public void deleteLoginLog(String id) {
        loginLogMapper.deleteLoginLog(id);
    }
}
