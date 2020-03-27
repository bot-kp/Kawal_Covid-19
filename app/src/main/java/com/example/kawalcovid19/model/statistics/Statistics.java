package com.example.kawalcovid19.model.statistics;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Statistics {
    @SerializedName("monitoring")
    private Monitoring monitoring;
    @SerializedName("supervision")
    private Supervision supervision;
    @SerializedName("positive")
    private Positive positive;
    @SerializedName("subdistrics")
    private List<Subdistric> subdistrics;
    @SerializedName("updatedAt")
    private String updatedAt;
    @SerializedName("villagerTotal")
    private String villagerTotal;

    public Statistics() {
    }

    public Statistics(Monitoring monitoring, Supervision supervision, Positive positive, List<Subdistric> subdistrics, String updatedAt, String villagerTotal) {
        this.monitoring = monitoring;
        this.supervision = supervision;
        this.positive = positive;
        this.subdistrics = subdistrics;
        this.updatedAt = updatedAt;
        this.villagerTotal = villagerTotal;
    }

    public Monitoring getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }

    public Supervision getSupervision() {
        return supervision;
    }

    public void setSupervision(Supervision supervision) {
        this.supervision = supervision;
    }

    public Positive getPositive() {
        return positive;
    }

    public void setPositive(Positive positive) {
        this.positive = positive;
    }

    public List<Subdistric> getSubdistrics() {
        return subdistrics;
    }

    public void setSubdistrics(List<Subdistric> subdistrics) {
        this.subdistrics = subdistrics;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getVillagerTotal() {
        return villagerTotal;
    }

    public void setVillagerTotal(String villagerTotal) {
        this.villagerTotal = villagerTotal;
    }
}
