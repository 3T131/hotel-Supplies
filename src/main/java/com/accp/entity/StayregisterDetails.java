package com.accp.entity;


/**
 * z住宿登记明细表
 */
public class StayregisterDetails {
    private int id;  // '住宿登记明细id'
    private int stayRegisterID ;//'住宿登记id'
    private int passengerID;// '旅客id'

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

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }
}
