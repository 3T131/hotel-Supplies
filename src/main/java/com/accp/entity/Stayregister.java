package com.accp.entity;

import java.util.Date;

/**
 * 住宿登记表
 */
public class Stayregister {

    private int id; //住宿登记ID
    private int predetermineID; //预定ID
    private int rentOutTypeID; //出租方式ID
    private int roomID; //房间ID
    private int payWayID; //结账方式ID
    private int billUnitID; //结账单位ID
    private int passengerTypeID; //旅客类别ID
    private int receiveTargetID; //接待对象ID
    private int deputyID; //副ID
    private int isBillID; //结账否
    private Date registerTime; //登记时间
    private String stayNumber; //住店天数/小时
    private Float sumConst; //总费用
    private String ChangingRoomNumber; //换房次数
    private Float changRoomMoney; //换房费
    private String remarks; //备注
    private Date payTime; //结账时间
    private Date changRoomTime; //换房时间
    private int remind; //提醒结账






}
