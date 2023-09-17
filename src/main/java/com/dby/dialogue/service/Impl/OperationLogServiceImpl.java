package com.dby.dialogue.service.Impl;

import com.dby.dialogue.entity.OperationLogEntity;

import java.util.List;

public interface OperationLogServiceImpl {

    public List<OperationLogEntity> getAllOperationLog();

    public OperationLogEntity getOperationLogById(String id);

    public void insertOperationLog(OperationLogEntity operationLog);

    public void updateOperationLog(OperationLogEntity operationLog);

    public void deleteOperationLog(String id);

}
