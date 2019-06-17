package com.feng.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class VLesson {
    private Integer lId;

    private Integer lType;

    private String lName;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date lDate;
    private Integer lPrice;
    private Integer lDay;
    private Integer lCId;
    private String cName;
    private String cUrl;

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public Integer getlType() {
        return lType;
    }

    public void setlType(Integer lType) {
        this.lType = lType;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Date getlDate() {
        return lDate;
    }

    public void setlDate(Date lDate) {
        this.lDate = lDate;
    }

    public Integer getlPrice() {
        return lPrice;
    }

    public void setlPrice(Integer lPrice) {
        this.lPrice = lPrice;
    }

    public Integer getlDay() {
        return lDay;
    }

    public void setlDay(Integer lDay) {
        this.lDay = lDay;
    }

    public Integer getlCId() {
        return lCId;
    }

    public void setlCId(Integer lCId) {
        this.lCId = lCId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcUrl() {
        return cUrl;
    }

    public void setcUrl(String cUrl) {
        this.cUrl = cUrl;
    }
}
