package com.example.dialogue;


import com.example.dialogue.entity.UserEntity;
import com.example.dialogue.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class MybatisApplicationTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsert() {
        userMapper.add(UserEntity.builder().id("10000").name("沉默王二").sex(1).build());
        userMapper.add(UserEntity.builder().id("10001").name("沉默王三").sex(1).build());
        userMapper.add(UserEntity.builder().id("10002").name("沉默王四").sex(1).build());
        log.info("查询所有：{}", userMapper.getAll().stream().toArray());
    }

    @Test
    void testQuery() {
        List<UserEntity> all = userMapper.getAll();
        log.info("查询所有：{}", all.stream().toArray());
    }

    @Test
    void testUpdate() {
        UserEntity one = userMapper.getById("10000");
        log.info("更新前{}", one);
        one.setName("engk");
        userMapper.update(one);
        log.info("更新后{}", userMapper.getById("10000"));
    }

    @Test
    void testDelete() {
        log.info("删除前{}", userMapper.getAll().toArray());
        userMapper.delete("10000");
        log.info("删除后{}", userMapper.getAll().toArray());
    }
}
