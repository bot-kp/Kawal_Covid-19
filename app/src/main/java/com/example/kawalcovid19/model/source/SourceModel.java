package com.example.kawalcovid19.model.source;

import com.google.gson.annotations.SerializedName;

public class SourceModel {
    @SerializedName("sourceStatisticKP")
    private String sourceStatisticKP = "";
    @SerializedName("sourceStatisticIndonesia")
    private String sourceStatisticIndonesia = "";
    @SerializedName("sourceMapsKP")
    private String sourceMapsKP = "";
    @SerializedName("sourceMapsIndonesia")
    private String sourceMapsIndonesia = "";

    SourceModel(){

    }
    SourceModel(String sourceStatisticKP, String sourceStatisticIndonesia, String sourceMapsKP, String sourceMapsIndonesia){
        this.sourceStatisticKP = sourceStatisticKP;
        this.sourceStatisticIndonesia = sourceStatisticIndonesia;
        this.sourceMapsKP = sourceMapsKP;
        this.sourceMapsIndonesia = sourceMapsIndonesia;
    }

    public String getSourceStatisticKP() {
        return sourceStatisticKP;
    }

    public void setSourceStatisticKP(String sourceStatisticKP) {
        this.sourceStatisticKP = sourceStatisticKP;
    }

    public String getSourceStatisticIndonesia() {
        return sourceStatisticIndonesia;
    }

    public void setSourceStatisticIndonesia(String sourceStatisticIndonesia) {
        this.sourceStatisticIndonesia = sourceStatisticIndonesia;
    }

    public String getSourceMapsKP() {
        return sourceMapsKP;
    }

    public void setSourceMapsKP(String sourceMapsKP) {
        this.sourceMapsKP = sourceMapsKP;
    }

    public String getSourceMapsIndonesia() {
        return sourceMapsIndonesia;
    }

    public void setSourceMapsIndonesia(String sourceMapsIndonesia) {
        this.sourceMapsIndonesia = sourceMapsIndonesia;
    }
}
