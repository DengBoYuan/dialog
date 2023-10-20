package com.dby.dialogue.entity;

import lombok.Data;

@Data
public class UserEntity {
    private String id;
    private String userName;
    private String account;
    private String userPassword;
    private String privateKey;
    private String userEmail;
    private String userQq;
    private String userWechat;
    private String description;
    private Boolean isLogin;
    private String lastIp;
    private String province;
    private String city;
    private String address;
    private String avatar;
    private String roleId;
    private Integer createdTime;
    private Integer updatedTime;
    private Integer deletedTime;
    private RoleEntity role;

    public UserEntity WrapEntity() {
        if (this.id == null) {
            this.id = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.account == null) {
            this.account = "";
        }
        if (this.userPassword == null) {
            this.userPassword = "";
        }
        if (this.privateKey == null) {
            this.privateKey = "";
        }
        if (this.userEmail == null) {
            this.userEmail = "";
        }
        if (this.userQq == null) {
            this.userQq = "";
        }
        if (this.userWechat == null) {
            this.userWechat = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.isLogin == null) {
            this.isLogin = true;
        }
        if (this.lastIp == null) {
            this.lastIp = "";
        }
        if (this.province == null) {
            this.province = "";
        }
        if (this.city == null) {
            this.city = "";
        }
        if (this.address == null) {
            this.address = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.roleId == null) {
            this.roleId = "";
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
        return this;
    }


}
