package com.dby.dialogue.entity;

import lombok.Data;

@Data
public class MessageEntity {
    private String id;
    private Integer createdTime;
    private Integer updatedTime;
    private Integer deletedTime;
    private String title;
    private String content;
    private String type;
    private String attachment;
    private String targetType;
    private String senderId;
    private Integer sendTime;
    private Boolean state;
    private String target;

    public MessageEntity wrapEntity() {
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
        if (this.title == null) {
            this.title = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.type == null) {
            this.type = "notice";
        }
        if (this.attachment == null) {
            this.attachment = "";
        }
        if (this.targetType == null) {
            this.targetType = "users";
        }
        if (this.senderId == null) {
            this.senderId = "";
        }
        if (this.sendTime == null) {
            this.sendTime = 0;
        }
        if (this.state == null) {
            this.state = true;
        }
        if (this.target == null) {
            this.target = "";
        }
        return this;
    }
}
