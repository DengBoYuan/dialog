package com.dby.dialogue.service.Impl;

import com.dby.dialogue.entity.PrivilegeEntity;

import java.util.List;

public interface PrivilegeServiceImpl {

    public List<PrivilegeEntity> getAllPriv();

    public PrivilegeEntity getPrivById(String id);

    public void insertPriv(PrivilegeEntity privilege);

    public void updatePriv(PrivilegeEntity privilege);

    public void deletePriv(String id);
}
