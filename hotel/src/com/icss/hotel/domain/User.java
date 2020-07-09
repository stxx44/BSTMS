package com.icss.hotel.domain;

import java.io.Serializable;

/**
 * 文档注释
 * 用户类
 */
public class User implements Serializable {
    private String account;
    private String password;
    private String emaile;
    private String sex;
    private String phone;
    private int group_id;
    private Integer state;
    private Integer level;

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", emaile='" + emaile + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", group_id=" + group_id +
                ", state=" + state +
                ", level=" + level +
                '}';
    }

    public User(String account, String password, String emaile, String sex, String phone, int group_id, Integer state, Integer level) {
        this.account = account;
        this.password = password;
        this.emaile = emaile;
        this.sex = sex;
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

    public String getEmaile() {
        return emaile;
    }

    public void setEmaile(String emaile) {
        this.emaile = emaile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
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