package com.example.kawalcovid19.model.statistics;

import com.google.gson.annotations.SerializedName;

public class Positive {
    @SerializedName("total")
    private String total = "0";
    @SerializedName("treated")
    private String treated = "0";
    @SerializedName("recovered")
    private String recovered = "0";
    @SerializedName("dead")
    private String dead = "0";

    public Positive() {
    }

    public Positive(String total, String treated, String recovered, String dead) {
        this.total = total;
        this.treated = treated;
        this.recovered = recovered;
        this.dead = dead;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTreated() {
        return treated;
    }

    public void setTreated(String treated) {
        this.treated = treated;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getDead() {
        return dead;
    }

    public void setDead(String dead) {
        this.dead = dead;
    }
}
