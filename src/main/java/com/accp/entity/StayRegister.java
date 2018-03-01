package com.accp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 住宿登记表
 */
public class StayRegister {

    private Integer stayRegisterId; //住宿登记ID
    private Integer deputyID; //副ID
    private Date registerTime; //登记时间
    private String stayNumber; //住店天数/小时
    private Float sumConst; //总费用
    private String changingRoomNumber; //换房次数
    private Float changRoomMoney; //换房费
    private String remarks; //备注
    private Date payTime; //结账时间
    private Date changRoomTime; //换房时间
    private Integer remind; //提醒结账
    private Integer LvKeLeiXingId; //提醒结账

// --------------------------------------
    private Integer predetermineID;  //预定表ID
    private Integer rentOutTypeID;//出租方式ID
    private Integer roomID;//房间ID
    private Integer payWayID;//结账方式ID
    private Integer billUnitID;//结账单位ID
    private Integer receiveTargetID;//接待对象ID
    private Integer passengerTypeID;//旅客类型ID
    private Integer isBillID;//是否结账ID

    /*-------------------------------------------------------*/
    private Predetermine predetermine;  //预定表
    private Room room;//房间
    private ReceiveTarget receiveTarget;//接待对象

    private String passengerType;//旅客类型
    private String isBill;//是否结账
    private String payWay;//结账方式
    private String billUnit;//结账单位
    private String rentOutType;//出租方式

    private List<Passenger> passengerList=new ArrayList<Passenger>();//旅客集合

    public Integer getStayRegisterId() {
        return stayRegisterId;
    }

    public void setStayRegisterId(Integer stayRegisterId) {
        this.stayRegisterId = stayRegisterId;
    }

    public Integer getDeputyID() {
        return deputyID;
    }

    public void setDeputyID(Integer deputyID) {
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
        return changingRoomNumber;
    }

    public void setChangingRoomNumber(String changingRoomNumber) {
        this.changingRoomNumber = changingRoomNumber;
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

    public Integer getRemind() {
        return remind;
    }

    public void setRemind(Integer remind) {
        this.remind = remind;
    }

    public Integer getLvKeLeiXiId() {
        return LvKeLeiXingId;
    }

    public void setLvKeLeiXiId(Integer LvKeLeiXingId) {
        this.LvKeLeiXingId = LvKeLeiXingId;
    }

    public Integer getPredetermineID() {
        return predetermineID;
    }

    public void setPredetermineID(Integer predetermineID) {
        this.predetermineID = predetermineID;
    }

    public Integer getRentOutTypeID() {
        return rentOutTypeID;
    }

    public void setRentOutTypeID(Integer rentOutTypeID) {
        this.rentOutTypeID = rentOutTypeID;
    }

    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public Integer getPayWayID() {
        return payWayID;
    }

    public void setPayWayID(Integer payWayID) {
        this.payWayID = payWayID;
    }

    public Integer getBillUnitID() {
        return billUnitID;
    }

    public void setBillUnitID(Integer billUnitID) {
        this.billUnitID = billUnitID;
    }

    public Integer getReceiveTargetID() {
        return receiveTargetID;
    }

    public void setReceiveTargetID(Integer receiveTargetID) {
        this.receiveTargetID = receiveTargetID;
    }

    public Integer getPassengerTypeID() {
        return passengerTypeID;
    }

    public void setPassengerTypeID(Integer passengerTypeID) {
        this.passengerTypeID = passengerTypeID;
    }

    public Integer getIsBillID() {
        return isBillID;
    }

    public void setIsBillID(Integer isBillID) {
        this.isBillID = isBillID;
    }

    public Predetermine getPredetermine() {
        return predetermine;
    }

    public void setPredetermine(Predetermine predetermine) {
        this.predetermine = predetermine;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public ReceiveTarget getReceiveTarget() {
        return receiveTarget;
    }

    public void setReceiveTarget(ReceiveTarget receiveTarget) {
        this.receiveTarget = receiveTarget;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public String getIsBill() {
        return isBill;
    }

    public void setIsBill(String isBill) {
        this.isBill = isBill;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getBillUnit() {
        return billUnit;
    }

    public void setBillUnit(String billUnit) {
        this.billUnit = billUnit;
    }

    public String getRentOutType() {
        return rentOutType;
    }

    public void setRentOutType(String rentOutType) {
        this.rentOutType = rentOutType;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
