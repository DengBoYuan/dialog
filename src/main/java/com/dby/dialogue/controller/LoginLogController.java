package com.dby.dialogue.controller;

import com.dby.dialogue.entity.LoginLogEntity;
import com.dby.dialogue.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loginLog")
public class LoginLogController {

    @Autowired
    LoginLogService loginLogService;

    @GetMapping("/all")
    public List<LoginLogEntity> getAllLoginLog() {
        return loginLogService.getAllLoginLog();
    }

    @GetMapping("/id/{id}")
    public LoginLogEntity getLoginLogById(@PathVariable("id") String id) {
        return loginLogService.getLoginLogById(id);
    }

    @PostMapping("/insert")
    public void insertLoginLog(@RequestBody LoginLogEntity loginLog) {
        loginLogService.insertLoginLog(loginLog);
    }

    @PostMapping("/update")
    public void updateLoginLog(@RequestBody LoginLogEntity loginLog) {
        loginLogService.updateLoginLog(loginLog);
    }

    @GetMapping("/delete/{id}")
    public void deleteLoginLog(@PathVariable("id") String id) {
        loginLogService.deleteLoginLog(id);
    }
}
