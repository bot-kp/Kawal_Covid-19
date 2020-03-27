package com.example.kawalcovid19;

public class NewsModel {
private int newsTumbnail;
private String titleNews;
private String detailNews;
private String newsDate;
private String affairsName;
private int affairsLogo;

    public String getAffairsName() {
        return affairsName;
    }

    public String getDetailNews() {
        return detailNews;
    }

    public void setDetailNews(String detailNews) {
        this.detailNews = detailNews;
    }

    public void setAffairsName(String affairsName) {
        this.affairsName = affairsName;
    }

    public int getAffairsLogo() {
        return affairsLogo;
    }

    public void setAffairsLogo(int affairsLogo) {
        this.affairsLogo = affairsLogo;
    }

    public int getNewsTumbnail() {
        return newsTumbnail;
    }

    public void setNewsTumbnail(int newsTumbnail) {
        this.newsTumbnail = newsTumbnail;
    }

    public String getTitleNews() {
        return titleNews;
    }

    public void setTitleNews(String titleNews) {
        this.titleNews = titleNews;
    }

    public String getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(String newsDate) {
        this.newsDate = newsDate;
    }

}
