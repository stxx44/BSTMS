package com.icss.hotel.domain;

public class Customer {
    private Integer cno;

    private String cname;

    private String gender;

    private String idcard;

    private String phone;

    private Integer integral;

    public Customer() {
    }

    public Customer(Integer cno, String cname, String gender, String idcard, String phone, Integer integral) {
        this.cno = cno;
        this.cname = cname;
        this.gender = gender;
        this.idcard = idcard;
        this.phone = phone;
        this.integral = integral;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }
}