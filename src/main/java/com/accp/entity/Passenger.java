package com.accp.entity;

/**
 * 旅客信息表
 */
public class Passenger {

    private Integer pId; //'旅客ID',
    private Integer papersID; //'证件ID',
    private Integer genderID; //'性别ID',
    private Integer passengerLevelID; //'旅客级别ID',
    private Integer nationID; //'民族ID',
    private String name; //'姓名',
    private String papersNumber; //'证件号码',
    private String birthDate; //'出生日期',
    private String papersValidity; //'证件有效期',
    private String phoneNumber; //'联系电话',
    private String remarks; //'备注',

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + pId +
                ", papersID=" + papersID +
                ", genderID=" + genderID +
                ", passengerLevelID=" + passengerLevelID +
                ", nationID=" + nationID +
                ", name='" + name + '\'' +
                ", papersNumber='" + papersNumber + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", papersValidity='" + papersValidity + '\'' +
                ", contactPhoneNumber='" + phoneNumber + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getPapersID() {
        return papersID;
    }

    public void setPapersID(Integer papersID) {
        this.papersID = papersID;
    }

    public Integer getGenderID() {
        return genderID;
    }

    public void setGenderID(Integer genderID) {
        this.genderID = genderID;
    }

    public Integer getPassengerLevelID() {
        return passengerLevelID;
    }

    public void setPassengerLevelID(Integer passengerLevelID) {
        this.passengerLevelID = passengerLevelID;
    }

    public Integer getNationID() {
        return nationID;
    }

    public void setNationID(Integer nationID) {
        this.nationID = nationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPapersNumber() {
        return papersNumber;
    }

    public void setPapersNumber(String papersNumber) {
        this.papersNumber = papersNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPapersValidity() {
        return papersValidity;
    }

    public void setPapersValidity(String papersValidity) {
        this.papersValidity = papersValidity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
