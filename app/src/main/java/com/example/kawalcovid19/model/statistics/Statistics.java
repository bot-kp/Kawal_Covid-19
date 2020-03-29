package com.example.kawalcovid19.model.statistics;

import com.google.gson.annotations.SerializedName;

import com.example.kawalcovid19.model.Base.StatisticBase;

import java.util.List;

public class Statistics extends StatisticBase {
    @SerializedName("monitoring")
    private Monitoring monitoring;
    @SerializedName("supervision")
    private Supervision supervision;
    @SerializedName("positive")
    private Positive positive;
    @SerializedName("subdistrics")
    private List<List<Subdistric>> subdistrics;
    @SerializedName("villagerTotal")
    private String villagerTotal;

    public Statistics() {
    }

    public Statistics(Monitoring monitoring, Supervision supervision, Positive positive, List<List<Subdistric>> subdistrics, String updatedAt, String villagerTotal, String maps) {
        this.monitoring = monitoring;
        this.supervision = supervision;
        this.positive = positive;
        this.subdistrics = subdistrics;
        this.villagerTotal = villagerTotal;
        this.setUpdatedAt(updatedAt);
        this.setMaps(maps);
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

    public List<List<Subdistric>> getSubdistrics() {
        return subdistrics;
    }

    public void setSubdistrics(List<List<Subdistric>> subdistrics) {
        this.subdistrics = subdistrics;
    }

    public String getVillagerTotal() {
        return villagerTotal;
    }

    public void setVillagerTotal(String villagerTotal) {
        this.villagerTotal = villagerTotal;
    }
}
