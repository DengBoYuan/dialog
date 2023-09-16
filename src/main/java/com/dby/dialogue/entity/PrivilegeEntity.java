package com.dby.dialogue.entity;

import lombok.Data;

@Data
public class PrivilegeEntity {
    private String id;
    private Integer createdTime;
    private Integer updatedTime;
    private Integer deletedTime;
    private String privilegeName;
    private String targetTag;
    private String action;
    private String description;

    public PrivilegeEntity wrapEntity() {
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
        if (this.privilegeName == null) {
            this.privilegeName = "";
        }
        if (this.targetTag == null) {
            this.targetTag = "";
        }
        if (this.action == null) {
            this.action = "view";
        }
        if (this.description == null) {
            this.description = "";
        }
        return this;
    }
}
