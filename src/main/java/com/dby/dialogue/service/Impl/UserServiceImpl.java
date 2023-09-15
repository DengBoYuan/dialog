package com.dby.dialogue.service.Impl;

import com.dby.dialogue.entity.UserEntity;

import java.util.List;

public interface UserServiceImpl {
    public UserEntity getUserInfoById(String id);

    public List<UserEntity> getAllUsersInfo();

    public UserEntity getUserInfoByUserName(String userName);

    public void insertUser(UserEntity userEntity);

    public void updateUser(UserEntity userEntity);

    public void deleteUserById(String id);
}
