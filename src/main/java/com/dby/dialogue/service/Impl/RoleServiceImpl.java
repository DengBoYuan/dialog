package com.dby.dialogue.service.Impl;

import com.dby.dialogue.entity.RoleEntity;

import java.util.List;

public interface RoleServiceImpl {

    public List<RoleEntity> getAllRole();

    public RoleEntity getRoleById(String id);

    public void insertRole(RoleEntity roleEntity);

    public void updateRole(RoleEntity roleEntity);

    public void deleteRoleById(String id);
}
