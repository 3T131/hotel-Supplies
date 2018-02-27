package com.accp.entity;
/**
 * 属性表
 */
public class Attribute {
    private int attributeId; //'属性ID',
    private String attributeName; //'属性名称',

    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
}
