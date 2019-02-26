package com.qfedu.pojo;

import java.util.Date;

public class Lesson {
    private Integer lId;

    private Integer lType;

    private String lName;

    private Date lDate;

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
        this.lName = lName == null ? null : lName.trim();
    }

    public Date getlDate() {
        return lDate;
    }

    public void setlDate(Date lDate) {
        this.lDate = lDate;
    }
}