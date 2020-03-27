package com.example.kawalcovid19.model.statistics;

import com.google.gson.annotations.SerializedName;

public class Subdistric {
    @SerializedName("name")
    private String name = "";
    @SerializedName("zip_code")
    private String zip_code = "";
    @SerializedName("latitude")
    private String latitude = "";
    @SerializedName("longitude")
    private String longitude = "";
    @SerializedName("odp")
    private String odp = "";
    @SerializedName("pdp")
    private String pdp = "";
    @SerializedName("positive")
    private String positive = "";

    public Subdistric() {
    }

    public Subdistric(String name, String zip_code, String latitude, String longitude, String odp, String pdp, String positive) {
        this.name = name;
        this.zip_code = zip_code;
        this.latitude = latitude;
        this.longitude = longitude;
        this.odp = odp;
        this.pdp = pdp;
        this.positive = positive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getOdp() {
        return odp;
    }

    public void setOdp(String odp) {
        this.odp = odp;
    }

    public String getPdp() {
        return pdp;
    }

    public void setPdp(String pdp) {
        this.pdp = pdp;
    }

    public String getPositive() {
        return positive;
    }

    public void setPositive(String positive) {
        this.positive = positive;
    }
}
