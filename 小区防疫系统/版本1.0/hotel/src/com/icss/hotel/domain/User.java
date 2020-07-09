package com.icss.hotel.domain;

import java.io.Serializable;

/**
 * 文档注释
 * 用户类
 */
public class User implements Serializable {
    private String account;
    private String password;
    private String email;
    private String phone;
    private Integer group_id;
    private Integer state;
    private Integer level;

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", emaile='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", group_id=" + group_id +
                ", state=" + state +
                ", level=" + level +
                '}';
    }

    public User(String account, String password, String email, String phone, Integer group_id, Integer state, Integer level) {
        this.account = account;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.group_id = group_id;
        this.state = state;
        this.level = level;
    }

    public User() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}