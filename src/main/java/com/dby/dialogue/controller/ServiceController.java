package com.dby.dialogue.controller;


import com.dby.dialogue.entity.SessionEntity;
import com.dby.dialogue.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/session")
public class ServiceController {

    @Autowired
    SessionService sessionService;

    @GetMapping("/all")
    public List<SessionEntity> getAllSession() {
        return sessionService.getAllSession();
    }

    @GetMapping("/id/{id}")
    public SessionEntity getSessionById(@PathVariable("id") String id) {
        return sessionService.getSessionById(id);
    }

    @PostMapping("/insert")
    public void insertSession(@RequestBody SessionEntity session) {
        sessionService.insertSession(session);
    }

    @PostMapping("/update")
    public void updateSession(@RequestBody SessionEntity session) {
        sessionService.updateSession(session);
    }

    @GetMapping("/delete/{id}")
    public void deleteSessionById(@PathVariable("id") String id) {
        sessionService.deleteSession(id);
    }
}
