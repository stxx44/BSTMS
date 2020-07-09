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
    private String group_id;
    private Integer state;
    private Integer level;
    private String g_level;
    private String name;
    public User() {
    }

    public User(String account, String password, String email, String phone, String group_id, Integer state, Integer level, String g_level, String name) {
        this.account = account;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.group_id = group_id;
        this.state = state;
        this.level = level;
        this.g_level = g_level;
        this.name = name;
    }

    public User(String account, String email, String group_id, String name) {
        this.account = account;
        this.email = email;
        this.group_id = group_id;
        this.name = name;
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

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
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

    public String getG_level() {
        return g_level;
    }

    public void setG_level(String g_level) {
        this.g_level = g_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", group_id='" + group_id + '\'' +
                ", state=" + state +
                ", level=" + level +
                ", g_level='" + g_level + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}