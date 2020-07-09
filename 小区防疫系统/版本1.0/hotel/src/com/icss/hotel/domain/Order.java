package com.icss.hotel.domain;

import java.io.Serializable;

public class Order implements Serializable{
    private Integer ono;

    private Integer cno;

    private Integer rno;

    private String starttime;

    private String endtime;

    private Integer ostate;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    private Integer empno;

    private String tname;

    private String cname;

    public Order(Integer ono, Integer cno, String starttime, String endtime, Integer empno, String tname,String cname ,Integer price, Integer rnum) {
        this.ono = ono;
        this.cno = cno;
        this.starttime = starttime;
        this.endtime = endtime;
        this.empno = empno;
        this.cname = cname;
        this.tname = tname;
        this.price = price;
        this.rnum = rnum;
    }

    public Order(Integer cno, String starttime, String endtime, Integer empno, Integer price, Integer rnum) {
        this.cno = cno;
        this.starttime = starttime;
        this.endtime = endtime;
        this.empno = empno;
        this.price = price;
        this.rnum = rnum;
    }

    public Order(Integer ono, Integer cno, Integer rno, String starttime, String endtime, Integer ostate, Integer empno, String tname,Integer  price, Integer rnum) {
        this.ono = ono;
        this.cno = cno;
        this.rno = rno;
        this.starttime = starttime;
        this.endtime = endtime;
        this.ostate = ostate;
        this.empno = empno;
        this.tname = tname;
        this.price = price;
        this.rnum = rnum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    private Integer price;

    public Integer getRnum() {
        return rnum;
    }

    private Integer rnum;

    public Order() {
    }

    public Order(Integer ono, Integer cno, Integer rno, String starttime, String endtime, Integer ostate, Integer empno, String tname,Integer rnum) {
        this.ono = ono;
        this.cno = cno;
        this.rno = rno;
        this.starttime = starttime;
        this.endtime = endtime;
        this.ostate = ostate;
        this.empno = empno;
        this.tname = tname;
        this.rnum = rnum;
    }

    public Order(Integer cno, Integer rno, String starttime, String endtime) {
        this.cno = cno;
        this.rno = rno;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public String getTname() {

        return tname;
    }
    public void setRnum(Integer  rnum){this.rnum = rnum;}


    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getOno() {
        return ono;
    }

    public void setOno(Integer ono) {
        this.ono = ono;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }
}