package com.dby.dialogue.controller;

import com.dby.dialogue.entity.SessionRecordEntity;
import com.dby.dialogue.service.SessionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessionRecord")
public class SessionRecordController {

    @Autowired
    SessionRecordService sessionRecordService;

    @GetMapping("/all")
    public List<SessionRecordEntity> getAllSessionRecord() {
        return sessionRecordService.getAllSessionRecord();
    }

    @GetMapping("/id/{id}")
    public SessionRecordEntity getSessionRecordById(@PathVariable("id") String id) {
        return sessionRecordService.getSessionRecordById(id);
    }

    @PostMapping("/insert")
    public void insertSessionRecord(@RequestBody SessionRecordEntity sessionRecord) {
        sessionRecordService.insertSessionRecord(sessionRecord);
    }

    @PostMapping("/update")
    public void updateSessionRecord(@RequestBody SessionRecordEntity sessionRecord) {
        sessionRecordService.updateSessionRecord(sessionRecord);
    }

    @GetMapping("/delete/{id}")
    public void deleteSessionRecord(@PathVariable("id") String id) {
        sessionRecordService.deleteSessionRecord(id);
    }
}
