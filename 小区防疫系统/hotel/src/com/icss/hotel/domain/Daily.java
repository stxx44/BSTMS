package com.icss.hotel.domain;

import java.io.Serializable;

public class Daily implements Serializable {
    String group_id;
    String time;
    String car;
    String goal;
    String name;

    public Daily(String group_id, String time, String car, String goal) {
        this.group_id = group_id;
        this.time = time;
        this.car = car;
        this.goal = goal;
    }

    public Daily(String group_id, String time, String car, String goal, String name) {
        this.group_id = group_id;
        this.time = time;
        this.car = car;
        this.goal = goal;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "group_id='" + group_id + '\'' +
                ", time='" + time + '\'' +
                ", car='" + car + '\'' +
                ", goal='" + goal + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Daily() {
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
