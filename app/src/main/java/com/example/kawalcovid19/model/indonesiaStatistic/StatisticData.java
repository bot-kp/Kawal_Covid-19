package com.example.kawalcovid19.model.indonesiaStatistic;

import com.google.gson.annotations.SerializedName;

public class StatisticData {
    @SerializedName("country")
    private String country;
    @SerializedName("cases")
    private Integer cases;
    @SerializedName("todayCases")
    private Integer todayCases;
    @SerializedName("deaths")
    private Integer deaths;
    @SerializedName("todayDeaths")
    private Integer todayDeaths;
    @SerializedName("recovered")
    private Integer recovered;
    @SerializedName("active")
    private Integer active;
    @SerializedName("critical")
    private Integer critical;
    @SerializedName("casesPerOneMillion")
    private Float casesPerOneMillion;
    @SerializedName("deathsPerOneMillion")
    private Float deathsPerOneMillion;


    public StatisticData(){}

    public StatisticData(String country, int cases, int todayCases, int deaths, int todayDeaths, int recovered, int active, int critical, float casesPerOneMillion, float deathsPerOneMillion){
        this.country  = country;
        this.cases = cases;
        this.todayCases = todayCases;
        this.deaths = deaths;
        this.todayDeaths = todayCases;
        this.recovered = recovered;
        this.active = active;
        this.critical = critical;
        this.casesPerOneMillion = casesPerOneMillion;
        this.deathsPerOneMillion = deathsPerOneMillion;

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCases(Integer cases) {
        this.cases = cases;
    }

    public Integer getCases() {
        return cases;
    }

    public void setTodayCases(Integer todayCases) {
        this.todayCases = todayCases;
    }

    public Integer getTodayCases() {
        return todayCases;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(Integer todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Float getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(Float casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public Float getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(Float deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }


}
