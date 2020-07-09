package com.icss.hotel.domain;

import java.io.Serializable;

public class Room implements Serializable {
    private Integer rno;

    private Integer tno;

    private String rnum;

    private Integer rstate;

    private String remark;


    public Room() {
    }

    public Room(Integer rno, Integer tno, String rnum, Integer rstate, String remark) {
        this.rno = rno;
        this.tno = tno;
        this.rnum = rnum;
        this.rstate = rstate;
        this.remark = remark;
    }


    public String getRnum() {
        return rnum;
    }

    public void setRnum(String rnum) {
        this.rnum = rnum;
    }

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public Integer getRstate() {
        return rstate;
    }

    public void setRstate(Integer rstate) {
        this.rstate = rstate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "Room{" +
                "rno=" + rno +
                ", tno=" + tno +
                ", rstate=" + rstate +
                ", remark='" + remark + '\'' +
                '}';
    }
}