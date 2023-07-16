package com.example.dialogue.mapper;

import com.example.dialogue.entity.UserEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Insert("INSERT INTO user(id,name,sex) VALUES(#{id}, #{name}, #{sex})")
    public void add(UserEntity entity);

    @Delete("DELETE FROM user WHERE id =#{id}")
    public void delete(String id);

    @Select("SELECT * FROM user WHERE id = #{id}")
    public UserEntity getById(String id);

    @Update("UPDATE user SET id=#{id},name=#{name},sex=#{sex} WHERE id =#{id}")
    public void update(UserEntity entity);

    @Select("SELECT * FROM user")
    List<UserEntity> getAll();
}
