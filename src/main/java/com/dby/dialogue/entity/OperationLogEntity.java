package com.dby.dialogue.entity;

import lombok.Data;

@Data
public class OperationLogEntity {
    private String id;
    private Integer createdTime;
    private Integer updatedTime;
    private Integer deletedTime;
    private String userId;
    private String action;
    private String target;
    private String rank;
    private String item;
    private UserEntity user;

    public OperationLogEntity wrapEntity() {
        if (this.id == null) {
            this.id = "";
        }
        if (this.createdTime == null) {
            this.createdTime = (int) (System.currentTimeMillis() / 1000);
        }
        if (this.updatedTime == null) {
            this.updatedTime = (int) (System.currentTimeMillis() / 1000);
        }
        if (this.deletedTime == null) {
            this.deletedTime = 0;
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.action == null) {
            this.action = "new";
        }
        if (this.target == null) {
            this.target = "";
        }
        if (this.rank == null) {
            this.rank = "user";
        }
        if (this.item == null) {
            this.item = "";
        }
        return this;
    }
}
