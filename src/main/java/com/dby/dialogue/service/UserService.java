package com.dby.dialogue.service;

import com.dby.dialogue.entity.UserEntity;
import com.dby.dialogue.mapper.UserMapper;
import com.dby.dialogue.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity getUserInfoById(String id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public List<UserEntity> getAllUsersInfo() {
        return userMapper.selectAllUser();
    }

    @Override
    public UserEntity getUserInfoByUserName(String userName) {
        return userMapper.selectUserByName(userName);
    }

    @Override
    public void insertUser(UserEntity userEntity) {
        userMapper.insertUser(userEntity);
    }

    @Override
    public void updateUser(UserEntity userEntity) {
        userMapper.updateUser(userEntity);
    }

    @Override
    public void deleteUserById(String id) {
        userMapper.deleteUserById(id);
    }
}
