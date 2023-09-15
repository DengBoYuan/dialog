package com.dby.dialogue.mapper;

import com.dby.dialogue.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<UserEntity> selectAllUser();

    public UserEntity selectUserById(String id);

    public UserEntity selectUserByName(String userName);

    public void insertUser(UserEntity userEntity);

    public void updateUser(UserEntity userEntity);

    public void deleteUserById(String id);
}
