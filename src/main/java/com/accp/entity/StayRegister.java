package com.accp.entity;

import java.util.Date;

/**
 * 住宿登记表
 */
public class StayRegister {

    private int stayRegisterId; //住宿登记ID
    private int deputyID; //副ID
    private Date registerTime; //登记时间
    private String stayNumber; //住店天数/小时
    private Float sumConst; //总费用
    private String ChangingRoomNumber; //换房次数
    private Float changRoomMoney; //换房费
    private String remarks; //备注
    private Date payTime; //结账时间
    private Date changRoomTime; //换房时间
    private int remind; //提醒结账

// --------------------------------------
    private int predetermineID;  //预定表ID
    private int rentOutTypeID;//出租方式ID
    private int roomID;//房间ID
    private int payWayID;//结账方式ID
    private int billUnitID;//结账单位ID
    private int passengerID;//接待对象ID
    private int passengerTypID;//旅客类型ID
    private int isBillID;//是否结账ID

    /*-------------------------------------------------------*/
    private Predetermine predetermine;  //预定表
    private AttributeDetails rentOutType;//出租方式
    private Room room;//房间
    private AttributeDetails payWay;//结账方式
    private AttributeDetails billUnit;//结账单位
    private Passenger passenger;//接待对象
    private AttributeDetails passengerTyp;//旅客类型
    private AttributeDetails isBill;//是否结账


    public int getPredetermineID() {
        return predetermineID;
    }

    public void setPredetermineID(int predetermineID) {
        this.predetermineID = predetermineID;
    }

    public int getRentOutTypeID() {
        return rentOutTypeID;
    }

    public void setRentOutTypeID(int rentOutTypeID) {
        this.rentOutTypeID = rentOutTypeID;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getPayWayID() {
        return payWayID;
    }

    public void setPayWayID(int payWayID) {
        this.payWayID = payWayID;
    }

    public int getBillUnitID() {
        return billUnitID;
    }

    public void setBillUnitID(int billUnitID) {
        this.billUnitID = billUnitID;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public int getPassengerTypID() {
        return passengerTypID;
    }

    public void setPassengerTypID(int passengerTypID) {
        this.passengerTypID = passengerTypID;
    }

    public int getIsBillID() {
        return isBillID;
    }

    public void setIsBillID(int isBillID) {
        this.isBillID = isBillID;
    }

    public int getStayRegisterId() {
        return stayRegisterId;
    }

    public void setStayRegisterId(int stayRegisterId) {
        this.stayRegisterId = stayRegisterId;
    }

    public int getDeputyID() {
        return deputyID;
    }

    public void setDeputyID(int deputyID) {
        this.deputyID = deputyID;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getStayNumber() {
        return stayNumber;
    }

    public void setStayNumber(String stayNumber) {
        this.stayNumber = stayNumber;
    }

    public Float getSumConst() {
        return sumConst;
    }

    public void setSumConst(Float sumConst) {
        this.sumConst = sumConst;
    }

    public String getChangingRoomNumber() {
        return ChangingRoomNumber;
    }

    public void setChangingRoomNumber(String changingRoomNumber) {
        ChangingRoomNumber = changingRoomNumber;
    }

    public Float getChangRoomMoney() {
        return changRoomMoney;
    }

    public void setChangRoomMoney(Float changRoomMoney) {
        this.changRoomMoney = changRoomMoney;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getChangRoomTime() {
        return changRoomTime;
    }

    public void setChangRoomTime(Date changRoomTime) {
        this.changRoomTime = changRoomTime;
    }

    public int getRemind() {
        return remind;
    }

    public void setRemind(int remind) {
        this.remind = remind;
    }

    public Predetermine getPredetermine() {
        return predetermine;
    }

    public void setPredetermine(Predetermine predetermine) {
        this.predetermine = predetermine;
    }

    public AttributeDetails getRentOutType() {
        return rentOutType;
    }

    public void setRentOutType(AttributeDetails rentOutType) {
        this.rentOutType = rentOutType;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public AttributeDetails getPayWay() {
        return payWay;
    }

    public void setPayWay(AttributeDetails payWay) {
        this.payWay = payWay;
    }

    public AttributeDetails getBillUnit() {
        return billUnit;
    }

    public void setBillUnit(AttributeDetails billUnit) {
        this.billUnit = billUnit;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public AttributeDetails getPassengerTyp() {
        return passengerTyp;
    }

    public void setPassengerTyp(AttributeDetails passengerTyp) {
        this.passengerTyp = passengerTyp;
    }

    public AttributeDetails getIsBill() {
        return isBill;
    }

    public void setIsBill(AttributeDetails isBill) {
        this.isBill = isBill;
    }
}
