package com.dby.dialogue.mapper;

import com.dby.dialogue.entity.RoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    public List<RoleEntity> selectAllRole();

    public RoleEntity selectRoleById(String id);

    public void insertRole(RoleEntity roleEntity);

    public void updateRoleById(RoleEntity roleEntity);

    public void deleteRoleById(RoleEntity roleEntity);
}
