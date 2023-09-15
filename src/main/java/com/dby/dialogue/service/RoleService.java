package com.dby.dialogue.service;

import com.dby.dialogue.entity.RoleEntity;
import com.dby.dialogue.mapper.RoleMapper;
import com.dby.dialogue.service.Impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements RoleServiceImpl {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<RoleEntity> getAllRole() {
        return roleMapper.selectAllRole();
    }

    @Override
    public RoleEntity getRoleById(String id) {
        return roleMapper.selectRoleById(id);
    }

    @Override
    public void insertRole(RoleEntity roleEntity) {
        roleMapper.insertRole(roleEntity);
    }

    @Override
    public void updateRole(RoleEntity roleEntity) {
        roleMapper.updateRole(roleEntity);
    }

    @Override
    public void deleteRoleById(String id) {
        roleMapper.deleteRoleById(id);
    }
}
