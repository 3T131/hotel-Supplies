package com.accp.entity;
import java.util.Date;
/**
 * 消费明细表
 */
public class ConsumptionDetails {

    private int consumptionDetailsId; //'消费明细ID',
    private int stayRegisterID; //'住宿登记ID',
    private int commodityID; //'商品ID',
    private String consumptionNumber; //'消费数量',
    private Float consumptionMoney; //'消费金额',
    private Date consumptionTime; //'消费时间',

    public int getConsumptionDetailsId() {
        return consumptionDetailsId;
    }

    public void setConsumptionDetailsId(int consumptionDetailsId) {
        this.consumptionDetailsId = consumptionDetailsId;
    }

    public int getStayRegisterID() {
        return stayRegisterID;
    }

    public void setStayRegisterID(int stayRegisterID) {
        this.stayRegisterID = stayRegisterID;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public String getConsumptionNumber() {
        return consumptionNumber;
    }

    public void setConsumptionNumber(String consumptionNumber) {
        this.consumptionNumber = consumptionNumber;
    }

    public Float getConsumptionMoney() {
        return consumptionMoney;
    }

    public void setConsumptionMoney(Float consumptionMoney) {
        this.consumptionMoney = consumptionMoney;
    }

    public Date getConsumptionTime() {
        return consumptionTime;
    }

    public void setConsumptionTime(Date consumptionTime) {
        this.consumptionTime = consumptionTime;
    }
}
