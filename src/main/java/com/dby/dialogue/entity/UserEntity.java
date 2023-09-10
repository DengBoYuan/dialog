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

    public UserEntity WrapEntity() {
        if (this.getId() == null) {
            this.setId("");
        }
        if (this.getId() == null) {
            this.setId("");
        }
        if (this.getAccount() == null) {
            this.setAccount("");
        }
        if (this.getUserPassword() == null) {
            this.setUserPassword("");
        }
        if (this.getPrivateKey() == null) {
            this.setPrivateKey("");
        }
        if (this.getUserEmail() == null) {
            this.setUserEmail("");
        }
        if (this.getUserQq() == null) {
            this.setUserQq("");
        }
        if (this.getUserWechat() == null) {
            this.setUserWechat("");
        }
        if (this.getDescription() == null) {
            this.setDescription("");
        }
        if (this.getIsLogin() == null) {
            this.setIsLogin(true);
        }
        if (this.getLastIp() == null) {
            this.setLastIp("");
        }
        if (this.getProvince() == null) {
            this.setProvince("");
        }
        if (this.getCity() == null) {
            this.setCity("");
        }
        if (this.getAddress() == null) {
            this.setAddress("");
        }
        if (this.getAvatar() == null) {
            this.setAvatar("");
        }
        if (this.getRoleId() == null) {
            this.setRoleId("");
        }
        if (this.getCreatedTime() == null) {
            this.setCreatedTime((int) (System.currentTimeMillis() / 1000));
        }
        if (this.getUpdatedTime() == null) {
            this.setUpdatedTime((int) (System.currentTimeMillis() / 1000));
        }
        if (this.getDeletedTime() == null) {
            this.setDeletedTime(0);
        }
        return this;
    }
}
