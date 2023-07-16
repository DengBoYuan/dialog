package com.example.dialogue.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

@Data
@Builder
public class UserEntity {
    private String id;
    private String name;
    private int sex;
    @Tolerate
    public UserEntity() {}
}
