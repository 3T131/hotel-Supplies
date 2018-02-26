package com.accp.entity;

import java.util.Date;
/**
 * 住宿登记表
 */
public class Depoit {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStayRegisterID() {
        return stayRegisterID;
    }

    public void setStayRegisterID(int stayRegisterID) {
        this.stayRegisterID = stayRegisterID;
    }

    public int getPayWayID() {
        return payWayID;
    }

    public void setPayWayID(int payWayID) {
        this.payWayID = payWayID;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Float getDeposit() {
        return deposit;
    }

    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }

    private int stayRegisterID; //'住宿登记ID',
    private int payWayID; //'支付方式ID',
    private Date registerTime; //'登记时间',
    private Float deposit; //'押金',


}
