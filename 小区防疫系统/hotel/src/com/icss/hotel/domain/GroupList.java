package com.icss.hotel.domain;

import java.io.Serializable;

public class GroupList implements Serializable {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GroupList(String account, String group_name, Integer g_level, String group_id, Integer id, String name) {
        this.account = account;
        this.group_name = group_name;
        this.g_level = g_level;
        this.group_id = group_id;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "GroupList{" +
                "account='" + account + '\'' +
                ", group_name='" + group_name + '\'' +
                ", g_level=" + g_level +
                ", group_id='" + group_id + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String account;
    String group_name;
    Integer g_level;
    String group_id;
    Integer id;
    String name;
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public Integer getG_level() {
        return g_level;
    }

    public void setG_level(Integer g_level) {
        this.g_level = g_level;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public GroupList() {
    }

    public GroupList(String account, String group_name, Integer g_level, String group_id) {
        this.account = account;
        this.group_name = group_name;
        this.g_level = g_level;
        this.group_id = group_id;
    }

}
