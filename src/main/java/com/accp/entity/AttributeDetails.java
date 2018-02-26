package com.accp.entity;
/**
 * 属性明细表
 */

public class AttributeDetails {
    private int id; //'属性明细ID',
    private int attributeID; //'属性ID',
    private String attributeDetailsName; //'属性明细名称',

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAttributeID() {
        return attributeID;
    }

    public void setAttributeID(int attributeID) {
        this.attributeID = attributeID;
    }

    public String getAttributeDetailsName() {
        return attributeDetailsName;
    }

    public void setAttributeDetailsName(String attributeDetailsName) {
        this.attributeDetailsName = attributeDetailsName;
    }
}
