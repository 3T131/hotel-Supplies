package com.accp.entity;


import java.util.Date;

/**
 * 接待对象表
 */
public class ReceiveTarget {

    private int id; //'接待对象ID',
    private int targetTypeID; //'对象类别ID',
    private String principal; //'负责人',
    private String teamName; //'团队名称',
    private String teamCode; //'团队编号',
    private Date registerTime;//'登记时间',
    private String contactPhoneNUmber; //'联系电话',


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTargetTypeID() {
        return targetTypeID;
    }

    public void setTargetTypeID(int targetTypeID) {
        this.targetTypeID = targetTypeID;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getContactPhoneNUmber() {
        return contactPhoneNUmber;
    }

    public void setContactPhoneNUmber(String contactPhoneNUmber) {
        this.contactPhoneNUmber = contactPhoneNUmber;
    }
}
