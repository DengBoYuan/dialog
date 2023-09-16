package com.dby.dialogue.controller;

import com.dby.dialogue.entity.RoleEntity;
import com.dby.dialogue.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/all")
    public List<RoleEntity> getAllRoleInfo() {
        return roleService.getAllRole();
    }

    @GetMapping("/id/{id}")
    public RoleEntity getRoleInfoById(@PathVariable("id") String id) {
        return roleService.getRoleById(id);
    }

    @PostMapping("/insert")
    public void insertRole(@RequestBody RoleEntity role) {
        role = role.wrapEntity();
        roleService.insertRole(role);
    }

    @PostMapping("/update")
    public void updateRole(@RequestBody RoleEntity role) {
        roleService.updateRole(role);
    }

    @GetMapping("/delete/{id}")
    public void deleteRoleById(@PathVariable("id") String id) {
        roleService.deleteRoleById(id);
    }
}
