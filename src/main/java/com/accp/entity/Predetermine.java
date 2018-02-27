package com.accp.entity;


import java.util.Date;

/**
 * 预定房间表
 */
public class Predetermine {

    private int predetermineId; //'预定ID',
    private int roomID; //'房间ID',
    private int predetermineTargetID; //'预定对象ID',
    private int passengerID; //'旅客ID',
    private int payWayID; //'支付方式 ID',
    private int predetermineStateID; //'预定状态ID',
    private Date arriveTime; //'抵达时间',
    private Float deposit; //'押金',
    private String predetermineDay; //'预定天数',
    private int remind; //'到时提示',

//    -------------------------------------------------------
    private Room room;//房间
    private ReceiveTarget predetermineTarget;//预定对象
    private Passenger passenger;//旅客
    private AttributeDetails payWay;//支付方式
    private AttributeDetails predetermineState;//预定状态

}
