package com.example.kawalcovid19.rest;

import com.example.kawalcovid19.NewsGet;
import com.example.kawalcovid19.model.indonesiaStatistic.IndonesiaGetStatistic;
import com.example.kawalcovid19.model.statistics.GetStatistics;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("statistics")
    Call<GetStatistics> getStatistics();
    @GET("indonesiaStatistic")
    Call<IndonesiaGetStatistic> getIndonesiaStatistic();

    @GET("news")
    Call<NewsGet> getNews();
}
