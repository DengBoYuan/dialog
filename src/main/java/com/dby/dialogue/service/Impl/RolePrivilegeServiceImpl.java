package com.dby.dialogue.service.Impl;

import com.dby.dialogue.entity.RolePrivilegeEntity;

import java.util.List;

public interface RolePrivilegeServiceImpl {

    public List<RolePrivilegeEntity> getAllRolePriv();

    public List<RolePrivilegeEntity> getRolePrivByRoleId(String roleId);

    public List<RolePrivilegeEntity> getRolePrivByPrivId(String privId);

    public void insertRolePriv(RolePrivilegeEntity rolePrivilege);

    public void deleteRolePriv(RolePrivilegeEntity rolePrivilege);
}
