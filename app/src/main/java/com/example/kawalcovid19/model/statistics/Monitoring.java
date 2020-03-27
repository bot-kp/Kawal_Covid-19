package com.example.kawalcovid19.model.statistics;

import com.google.gson.annotations.SerializedName;

public class Monitoring {
    @SerializedName("total")
    private String total = "0";
    @SerializedName("done")
    private String done = "0";
    @SerializedName("inprogress")
    private String inprogress = "0";
    @SerializedName("pdp")
    private String pdp = "0";

    public Monitoring() {
    }

    public Monitoring(String total, String done, String inprogress, String pdp) {
        this.total = total;
        this.done = done;
        this.inprogress = inprogress;
        this.pdp = pdp;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public String getInprogress() {
        return inprogress;
    }

    public void setInprogress(String inprogress) {
        this.inprogress = inprogress;
    }

    public String getPdp() {
        return pdp;
    }

    public void setPdp(String pdp) {
        this.pdp = pdp;
    }
}
