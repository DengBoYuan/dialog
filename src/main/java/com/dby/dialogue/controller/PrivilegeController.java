package com.dby.dialogue.controller;

import com.dby.dialogue.entity.PrivilegeEntity;
import com.dby.dialogue.service.PrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/priv")
public class PrivilegeController {

    @Autowired
    PrivilegeService privilegeService;

    @GetMapping("/all")
    public List<PrivilegeEntity> getAllPrivInfo() {
        return privilegeService.getAllPriv();
    }

    @GetMapping("/id/{id}")
    public PrivilegeEntity getPrivInfoById(@PathVariable("id") String id) {
        return privilegeService.getPrivById(id);
    }

    @PostMapping("/insert")
    public void insertPriv(@RequestBody PrivilegeEntity privilege) {
        privilege = privilege.wrapEntity();
        privilegeService.insertPriv(privilege);
    }

    @PostMapping("/update")
    public void updatePriv(@RequestBody PrivilegeEntity privilege) {
        privilegeService.updatePriv(privilege);
    }

    @GetMapping("/delete/{id}")
    public void deletePriv(@PathVariable("id") String id) {
        privilegeService.deletePriv(id);
    }
}
