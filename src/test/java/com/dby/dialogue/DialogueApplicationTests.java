package com.dby.dialogue;

import com.dby.dialogue.entity.RoleEntity;
import com.dby.dialogue.entity.UserEntity;
import com.dby.dialogue.mapper.RoleMapper;
import com.dby.dialogue.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DialogueApplicationTests {

    @Autowired
    RoleMapper roleMapper;

    @Test void test() {
        RoleEntity role = new RoleEntity();
        role.setId("00001");
        role.setDeletedTime((int) (System.currentTimeMillis() / 1000));
        roleMapper.deleteRoleById(role);
    }
}
