package com.dby.dialogue.entity;

import lombok.Data;

@Data
public class SessionRecordEntity {
    private String id;
    private Integer createdTime;
    private Integer updatedTime;
    private Integer deletedTime;
    private String sessionId;
    private String senderId;
    private String receiverId;
    private String content;
    private String contentType;
    private UserEntity sender;
    private UserEntity receiver;

    public SessionRecordEntity wrapEntity() {
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
        if (this.sessionId == null) {
            this.sessionId = "";
        }
        if (this.senderId == null) {
            this.senderId = "";
        }
        if (this.receiverId == null) {
            this.receiverId = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.contentType == null) {
            this.contentType = "text";
        }
        return this;
    }
}
