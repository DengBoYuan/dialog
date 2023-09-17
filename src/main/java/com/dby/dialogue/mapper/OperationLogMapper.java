package com.dby.dialogue.mapper;

import com.dby.dialogue.entity.OperationLogEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OperationLogMapper {

    public List<OperationLogEntity> getAllOperationLog();

    public OperationLogEntity getOperationLogById(String id);

    public void insertOperationLog(OperationLogEntity operationLog);

    public void updateOperationLog(OperationLogEntity operationLog);

    public void deleteOperationLog(String id);

}
