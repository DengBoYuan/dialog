package com.dby.dialogue.entity;

import lombok.Data;

@Data
public class RoleEntity {
    private String id;
    private String roleName;
    private Integer createdTime;
    private Integer updatedTime;
    private Integer deletedTime;
    private String description;
    private String roleType;

    public RoleEntity wrapEntity(){
        if (this.id == null) {
            this.id = "";
        }
        if (this.roleName == null) {
            this.roleName = "";
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
        if (this.description == null) {
            this.description = "";
        }
        if (this.roleType == null) {
            this.roleType = "normal";
        }
        return this;
    }
}
