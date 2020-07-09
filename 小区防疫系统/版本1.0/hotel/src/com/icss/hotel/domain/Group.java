package com.icss.hotel.domain;

import java.io.Serializable;

public class Group implements Serializable {
    Integer group_id;
    String group_name;
    String prov;
    String city;
    String country;
    String owner;
    String account;
    String code;

    public Integer getGroup_id() {
        return group_id;
    }
    @Override
    public String toString() {
        return "Group{" +
                "group_id=" + group_id +
                ", group_name='" + group_name + '\'' +
                ", prov='" + prov + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", owner='" + owner + '\'' +
                ", account='" + account + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Group() {
    }

    public Group(Integer group_id, String group_name, String prov, String city, String country, String owner, String account, String code) {
        this.group_id = group_id;
        this.group_name = group_name;
        this.prov = prov;
        this.city = city;
        this.country = country;
        this.owner = owner;
        this.account = account;
        this.code = code;
    }
}
