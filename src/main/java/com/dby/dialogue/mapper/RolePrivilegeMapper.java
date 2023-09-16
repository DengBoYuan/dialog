package com.dby.dialogue.mapper;

import com.dby.dialogue.entity.RolePrivilegeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RolePrivilegeMapper {

    public List<RolePrivilegeEntity> getAllRolePriv();

    public List<RolePrivilegeEntity> getRolePrivByRoleId(String roleId);

    public List<RolePrivilegeEntity> getRolePrivByPrivId(String privId);

    public void insertRolePriv(RolePrivilegeEntity rolePrivilege);

    public void deleteRolePriv(RolePrivilegeEntity rolePrivilege);
}
