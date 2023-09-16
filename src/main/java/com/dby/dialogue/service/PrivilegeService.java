package com.dby.dialogue.service;

import com.dby.dialogue.entity.PrivilegeEntity;
import com.dby.dialogue.mapper.PrivilegeMapper;
import com.dby.dialogue.service.Impl.PrivilegeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class PrivilegeService implements PrivilegeServiceImpl {

    @Autowired
    PrivilegeMapper privilegeMapper;

    @Override
    public List<PrivilegeEntity> getAllPriv() {
        return privilegeMapper.selectAllPrivilege();
    }

    @Override
    public PrivilegeEntity getPrivById(String id) {
        return privilegeMapper.selectPrivilegeById(id);
    }

    @Override
    public void insertPriv(PrivilegeEntity privilege) {
        privilegeMapper.insertPrivilege(privilege);
    }

    @Override
    public void updatePriv(PrivilegeEntity privilege) {
        privilegeMapper.updatePrivilege(privilege);
    }

    @Override
    public void deletePriv(String id) {
        privilegeMapper.deletePrivilegeById(id);
    }
}
