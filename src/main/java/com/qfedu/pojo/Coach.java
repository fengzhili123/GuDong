package com.qfedu.pojo;

public class Coach {
    private Integer cId;

    private String cName;

    private String cComment;

    private String cExperience;

    private String cType;
    private String cUrl;

    public String getcUrl() {
        return cUrl;
    }

    public void setcUrl(String cUrl) {
        this.cUrl = cUrl;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment == null ? null : cComment.trim();
    }

    public String getcExperience() {
        return cExperience;
    }

    public void setcExperience(String cExperience) {
        this.cExperience = cExperience == null ? null : cExperience.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }
}