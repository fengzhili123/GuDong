package com.qfedu.pojo;

public class Train {
    private Integer tId;

    private String tName;

    private String tType;

    private Integer tCapacity;

    private Integer tPrice;

    private Integer cId;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType == null ? null : tType.trim();
    }

    public Integer gettCapacity() {
        return tCapacity;
    }

    public void settCapacity(Integer tCapacity) {
        this.tCapacity = tCapacity;
    }

    public Integer gettPrice() {
        return tPrice;
    }

    public void settPrice(Integer tPrice) {
        this.tPrice = tPrice;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}