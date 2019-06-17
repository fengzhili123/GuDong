package com.feng.pojo;

import java.util.Date;

public class News {
    private Integer newsId;

    private String newsTitle;

    private String newsDetails;

    private Date newsDate;

    private String newsRead;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsDetails() {
        return newsDetails;
    }

    public void setNewsDetails(String newsDetails) {
        this.newsDetails = newsDetails == null ? null : newsDetails.trim();
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    public String getNewsRead() {
        return newsRead;
    }

    public void setNewsRead(String newsRead) {
        this.newsRead = newsRead == null ? null : newsRead.trim();
    }
}