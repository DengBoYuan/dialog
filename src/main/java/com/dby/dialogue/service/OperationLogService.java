package com.dby.dialogue.service;

import com.dby.dialogue.entity.OperationLogEntity;
import com.dby.dialogue.mapper.OperationLogMapper;
import com.dby.dialogue.service.Impl.OperationLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationLogService implements OperationLogServiceImpl {

    @Autowired
    OperationLogMapper operationLogMapper;

    @Override
    public List<OperationLogEntity> getAllOperationLog() {
        return operationLogMapper.getAllOperationLog();
    }

    @Override
    public OperationLogEntity getOperationLogById(String id) {
        return operationLogMapper.getOperationLogById(id);
    }

    @Override
    public void insertOperationLog(OperationLogEntity operationLog) {
        operationLog = operationLog.wrapEntity();
        operationLogMapper.insertOperationLog(operationLog);
    }

    @Override
    public void updateOperationLog(OperationLogEntity operationLog) {
        operationLogMapper.updateOperationLog(operationLog);
    }

    @Override
    public void deleteOperationLog(String id) {
        operationLogMapper.deleteOperationLog(id);
    }
}
