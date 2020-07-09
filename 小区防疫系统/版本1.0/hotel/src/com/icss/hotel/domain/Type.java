package com.icss.hotel.domain;

import java.io.Serializable;

public class Type implements Serializable {
    private Integer tno;

    private String tname;

    private Double price;

    private Integer totalnum;

    private Integer restnum;

    public Type() {
    }

    public Type(Integer tno, String tname, Double price, Integer totalnum, Integer restnum) {
        this.tno = tno;
        this.tname = tname;
        this.price = price;
        this.totalnum = totalnum;
        this.restnum = restnum;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(Integer totalnum) {
        this.totalnum = totalnum;
    }

    public Integer getRestnum() {
        return restnum;
    }

    public void setRestnum(Integer restnum) {
        this.restnum = restnum;
    }

    @Override
    public String toString() {
        return "Type{" +
                "tno=" + tno +
                ", tname='" + tname + '\'' +
                ", price=" + price +
                ", totalnum=" + totalnum +
                ", restnum=" + restnum +
                '}';
    }
}