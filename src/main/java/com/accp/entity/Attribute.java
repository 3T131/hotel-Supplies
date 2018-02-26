package com.accp.entity;
/**
 * 属性表
 */
public class Attribute {
    private int id; //'属性ID',
    private String attributeName; //'属性名称',

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
}
