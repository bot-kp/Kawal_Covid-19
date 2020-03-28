package com.example.kawalcovid19.rest;

import com.example.kawalcovid19.model.statistics.GetStatistics;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("statistics")
    Call<GetStatistics> getStatistics();
    @GET("indonesiaStatistic")
    Call<GetStatistics> getStatistic();
}
