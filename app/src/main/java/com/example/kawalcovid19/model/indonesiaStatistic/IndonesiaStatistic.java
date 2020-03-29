package com.example.kawalcovid19.model.indonesiaStatistic;

import com.example.kawalcovid19.model.Base.StatisticBase;
import com.google.gson.annotations.SerializedName;

public class IndonesiaStatistic extends StatisticBase {
    @SerializedName("statistic")
    StatisticData statistic;
    @SerializedName("villagerTotal")
    private String villagerTotal;

    public IndonesiaStatistic(){}

    public IndonesiaStatistic(StatisticData statistic, String updatedAt, String maps, String villagersTotal){

        this.statistic = statistic;
        this.setUpdatedAt(updatedAt);
        this.setMaps(maps);
        this.villagerTotal = villagersTotal;
    }

    public StatisticData getStatistic() {
        return statistic;
    }

    public void setStatistic(StatisticData statistic) {
        this.statistic = statistic;
    }
    public String getTotalVillagers() {
        return villagerTotal;
    }

    public void setTotalVillagers(String totalVillagers) {
        this.villagerTotal = totalVillagers;
    }
}
