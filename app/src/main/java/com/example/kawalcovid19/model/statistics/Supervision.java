package com.example.kawalcovid19.model.statistics;

import com.google.gson.annotations.SerializedName;

public class Supervision {
    @SerializedName("total")
    private String total = "0";
    @SerializedName("treated")
    private String treated = "0";
    @SerializedName("in_home")
    private String in_home = "0";
    @SerializedName("sample")
    private String sample = "0";
    @SerializedName("lab_process")
    private String lab_process = "0";
    @SerializedName("positive")
    private String positive = "0";
    @SerializedName("negative")
    private String negative = "0";

    public Supervision() {
    }

    public Supervision(String total, String treated, String in_home, String sample, String lab_process, String positive, String negative) {
        this.total = total;
        this.treated = treated;
        this.in_home = in_home;
        this.sample = sample;
        this.lab_process = lab_process;
        this.positive = positive;
        this.negative = negative;
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

    public String getIn_home() {
        return in_home;
    }

    public void setIn_home(String in_home) {
        this.in_home = in_home;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getLab_process() {
        return lab_process;
    }

    public void setLab_process(String lab_process) {
        this.lab_process = lab_process;
    }

    public String getPositive() {
        return positive;
    }

    public void setPositive(String positive) {
        this.positive = positive;
    }

    public String getNegative() {
        return negative;
    }

    public void setNegative(String negative) {
        this.negative = negative;
    }
}
