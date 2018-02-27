package com.accp.entity;
/**
 * 商品表
 */
public class Commodity {

    private int commodityId; //'商品ID',
    private int commodityTypeID; //'商品类别ID',
    private int uOMID; //'计量单位ID',
    private String commodityName; //'商品名称',
    private Float salePrice; //'销售价格',
    private AttributeDetails commodityType;//商品类别

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public int getCommodityTypeID() {
        return commodityTypeID;
    }

    public void setCommodityTypeID(int commodityTypeID) {
        this.commodityTypeID = commodityTypeID;
    }

    public int getuOMID() {
        return uOMID;
    }

    public void setuOMID(int uOMID) {
        this.uOMID = uOMID;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }
}
