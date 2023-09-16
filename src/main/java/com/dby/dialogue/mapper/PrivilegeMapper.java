package com.dby.dialogue.mapper;

import com.dby.dialogue.entity.PrivilegeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PrivilegeMapper {

    public List<PrivilegeEntity> selectAllPrivilege();

    public PrivilegeEntity selectPrivilegeById(String id);

    public void insertPrivilege(PrivilegeEntity privilege);

    public void updatePrivilege(PrivilegeEntity privilege);

    public void deletePrivilegeById(String id);
}
