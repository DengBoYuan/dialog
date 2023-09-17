package com.dby.dialogue.controller;

import com.dby.dialogue.entity.OperationLogEntity;
import com.dby.dialogue.service.OperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operationLog")
public class OperationLogController {

    @Autowired
    OperationLogService operationLogService;

    @GetMapping("/all")
    public List<OperationLogEntity> getAllOperationLog() {
        return operationLogService.getAllOperationLog();
    }

    @GetMapping("/id/{id}")
    public OperationLogEntity getOperationLogById(@PathVariable("id") String id) {
        return operationLogService.getOperationLogById(id);
    }

    @PostMapping("/insert")
    public void insertOperationLog(@RequestBody OperationLogEntity operationLog) {
        operationLog = operationLog.wrapEntity();
        operationLogService.insertOperationLog(operationLog);
    }

    @PostMapping("/update")
    public void updateOperationLog(@RequestBody OperationLogEntity operationLog) {
        operationLogService.updateOperationLog(operationLog);
    }

    @GetMapping("/delete/{id}")
    public void deleteOperationLog(@PathVariable("id") String id) {
        operationLogService.deleteOperationLog(id);
    }
}
