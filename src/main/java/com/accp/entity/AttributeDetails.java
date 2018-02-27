package com.accp.entity;
/**
 * 属性明细表
 */

public class AttributeDetails {
    private int attributeDetailsId; //'属性明细ID',
    private int attributeID; //'属性ID',
    private String attributeDetailsName; //'属性明细名称',
    private Attribute attributeName;//属性名

    public int getAttributeDetailsId() {
        return attributeDetailsId;
    }

    public void setAttributeDetailsId(int attributeDetailsId) {
        this.attributeDetailsId = attributeDetailsId;
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
