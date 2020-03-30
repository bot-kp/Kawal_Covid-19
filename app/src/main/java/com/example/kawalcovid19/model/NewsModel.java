package com.example.kawalcovid19.model;

import com.google.gson.annotations.SerializedName;

public class NewsModel {
    @SerializedName("hash")
    private String hash;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("title")
    private String title;
    @SerializedName("postedAt")
    private String postedAt;
    @SerializedName("desc")
    private String desc;
    @SerializedName("source")
    private String source;
    @SerializedName("sourceLogo")
    private String sourceLogo;

    public NewsModel() {

    }

    public NewsModel(String hash, String thumbnail, String title, String postedAt, String desc, String source, String sourceLogo) {
        this.hash = hash;
        this.thumbnail = thumbnail;
        this.title = title;
        this.postedAt = postedAt;
        this.desc = desc;
        this.source = source;
        this.sourceLogo = sourceLogo;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceLogo() {
        return sourceLogo;
    }

    public void setSourceLogo(String sourceLogo) {
        this.sourceLogo = sourceLogo;
    }
}
