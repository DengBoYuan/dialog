package com.dby.dialogue.entity;

import lombok.Data;

@Data
public class LoginLogEntity {
    private String id;
    private Integer createdTime;
    private Integer updatedTime;
    private Integer deletedTime;
    private String userId;
    private String loginIp;

    public LoginLogEntity wrapEntity() {
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
        if (this.loginIp == null) {
            this.loginIp = "";
        }
        return this;
    }
}
