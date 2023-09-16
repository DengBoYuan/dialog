package com.dby.dialogue.service;

import com.dby.dialogue.entity.RolePrivilegeEntity;
import com.dby.dialogue.mapper.RolePrivilegeMapper;
import com.dby.dialogue.service.Impl.RolePrivilegeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePrivilegeService implements RolePrivilegeServiceImpl {

    @Autowired
    RolePrivilegeMapper rolePrivilegeMapper;

    @Override
    public List<RolePrivilegeEntity> getAllRolePriv() {
        return rolePrivilegeMapper.getAllRolePriv();
    }

    @Override
    public List<RolePrivilegeEntity> getRolePrivByRoleId(String roleId) {
        return rolePrivilegeMapper.getRolePrivByRoleId(roleId);
    }

    @Override
    public List<RolePrivilegeEntity> getRolePrivByPrivId(String privId) {
        return rolePrivilegeMapper.getRolePrivByPrivId(privId);
    }

    @Override
    public void insertRolePriv(RolePrivilegeEntity rolePrivilege) {
        rolePrivilegeMapper.insertRolePriv(rolePrivilege);
    }

    @Override
    public void deleteRolePriv(RolePrivilegeEntity rolePrivilege) {
        rolePrivilegeMapper.deleteRolePriv(rolePrivilege);
    }
}
