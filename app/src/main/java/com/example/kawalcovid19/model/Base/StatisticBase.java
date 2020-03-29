package com.example.kawalcovid19.model.Base;

import com.google.gson.annotations.SerializedName;

public class StatisticBase {
    @SerializedName("updatedAt")
    private String updatedAt = "";

    public StatisticBase(){}

    public StatisticBase(String updatedAt){
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
