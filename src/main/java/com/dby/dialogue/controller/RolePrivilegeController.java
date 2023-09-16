package com.dby.dialogue.controller;

import com.dby.dialogue.entity.RolePrivilegeEntity;
import com.dby.dialogue.service.RolePrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rolePriv")
public class RolePrivilegeController {

    @Autowired
    RolePrivilegeService rolePrivilegeService;

    @GetMapping("/all")
    public List<RolePrivilegeEntity> getAllRolePriv() {
        return rolePrivilegeService.getAllRolePriv();
    }

    @GetMapping("/roleId/{roleId}")
    public List<RolePrivilegeEntity> getRolePrivByRoleId(@PathVariable("roleId") String roleId) {
        return rolePrivilegeService.getRolePrivByRoleId(roleId);
    }

    @GetMapping("/privId/{privId}")
    public List<RolePrivilegeEntity> getRolePrivByPrivId(@PathVariable("privId") String privId) {
        return rolePrivilegeService.getRolePrivByPrivId(privId);
    }

    @PostMapping("/insert")
    public void insertRolePriv(@RequestBody RolePrivilegeEntity rolePrivilege) {
        rolePrivilegeService.insertRolePriv(rolePrivilege);
    }

    @PostMapping("/delete")
    public void deleteRolePriv(@RequestBody RolePrivilegeEntity rolePrivilege) {
        rolePrivilegeService.deleteRolePriv(rolePrivilege);
    }
}
