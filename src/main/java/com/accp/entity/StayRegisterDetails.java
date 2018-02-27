package com.accp.entity;


/**
 * z住宿登记明细表
 */
public class StayRegisterDetails {
    private int stayRegisterDetailsId;  // '住宿登记明细id'
    private int stayRegisterID ;//'住宿登记id'
    private int passengerID;// '旅客id'

    public int getId() {
        return stayRegisterDetailsId;
    }

    public void setId(int id) {
        this.stayRegisterDetailsId = id;
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
