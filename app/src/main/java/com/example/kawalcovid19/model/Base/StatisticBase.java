package com.example.kawalcovid19.model.Base;

import com.google.gson.annotations.SerializedName;

public class StatisticBase {
    @SerializedName("updatedAt")
    private String updatedAt = "";
    @SerializedName("maps")
    private String maps = "";

    public StatisticBase(){}

    public StatisticBase(String updatedAt, String maps){
        this.updatedAt = updatedAt;
        this.maps = maps;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getMaps() {
        return maps;
    }

    public void setMaps(String maps) {
        this.maps = maps;
    }
}
