package com.dby.dialogue.entity;

import lombok.Data;

@Data
public class MessageUserEntity {
    private String id;
    private Integer createdTime;
    private Integer updatedTime;
    private Integer deletedTime;
    private String messageId;
    private Boolean state;
    private Integer readTime;
    private String userId;

    public MessageUserEntity wrapEntity() {
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
        if (this.messageId == null) {
            this.messageId = "";
        }
        if (this.state == null) {
            this.state = true;
        }
        if (this.readTime == null) {
            this.readTime = 0;
        }
        if (this.userId == null) {
            this.userId = "";
        }
        return this;
    }
}
