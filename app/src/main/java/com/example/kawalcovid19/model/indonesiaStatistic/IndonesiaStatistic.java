package com.example.kawalcovid19.model.indonesiaStatistic;

import com.example.kawalcovid19.model.Base.StatisticBase;
import com.google.gson.annotations.SerializedName;

public class IndonesiaStatistic extends StatisticBase {
    @SerializedName("statistic")
    StatisticData statistic;

    public IndonesiaStatistic(){}

    public IndonesiaStatistic(StatisticData statistic, String updatedAt){
        this.statistic = statistic;
        this.setUpdatedAt(updatedAt);
    }

    public StatisticData getStatistic() {
        return statistic;
    }

    public void setStatistic(StatisticData statistic) {
        this.statistic = statistic;
    }
}
