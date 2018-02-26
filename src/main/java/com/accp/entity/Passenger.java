package com.accp.entity;

/**
 * 旅客信息表
 */
public class Passenger {

    private int id ; //'旅客ID',
    private int papersID; //'证件ID',
    private int educationDegreeID; //'文化程度ID',
   // private int genderID; //'性别ID',
    private int passengerLevelID; //'旅客级别ID',
    private int nationID; //'民族ID',
    private int thingReasonID; //'事由',
    private String name; //'姓名',
    private String papersNumber; //'证件号码',
    private String birthDate; //'出生日期',
    private String licenceIssuingAuthorty; //'发证机关',
    private String unitsOrAddress; //'单位或住址',
    private String papersValidity; //'证件有效期',
    private String profession; //'职业',
    private String whereAreFrom; //'从何处来',
    private String whereToGo; //'到哪里去',
    private String contactPhoneNumber; //'联系电话',
    private String remarks; //'备注',
    private AttributeDetails gender; //性别

    public AttributeDetails getGender() {
        return gender;
    }

    public void setGender(AttributeDetails gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPapersID() {
        return papersID;
    }

    public void setPapersID(int papersID) {
        this.papersID = papersID;
    }

    public int getEducationDegreeID() {
        return educationDegreeID;
    }

    public void setEducationDegreeID(int educationDegreeID) {
        this.educationDegreeID = educationDegreeID;
    }



    public int getPassengerLevelID() {
        return passengerLevelID;
    }

    public void setPassengerLevelID(int passengerLevelID) {
        this.passengerLevelID = passengerLevelID;
    }

    public int getNationID() {
        return nationID;
    }

    public void setNationID(int nationID) {
        this.nationID = nationID;
    }

    public int getThingReasonID() {
        return thingReasonID;
    }

    public void setThingReasonID(int thingReasonID) {
        this.thingReasonID = thingReasonID;
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

    public String getLicenceIssuingAuthorty() {
        return licenceIssuingAuthorty;
    }

    public void setLicenceIssuingAuthorty(String licenceIssuingAuthorty) {
        this.licenceIssuingAuthorty = licenceIssuingAuthorty;
    }

    public String getUnitsOrAddress() {
        return unitsOrAddress;
    }

    public void setUnitsOrAddress(String unitsOrAddress) {
        this.unitsOrAddress = unitsOrAddress;
    }

    public String getPapersValidity() {
        return papersValidity;
    }

    public void setPapersValidity(String papersValidity) {
        this.papersValidity = papersValidity;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWhereAreFrom() {
        return whereAreFrom;
    }

    public void setWhereAreFrom(String whereAreFrom) {
        this.whereAreFrom = whereAreFrom;
    }

    public String getWhereToGo() {
        return whereToGo;
    }

    public void setWhereToGo(String whereToGo) {
        this.whereToGo = whereToGo;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
