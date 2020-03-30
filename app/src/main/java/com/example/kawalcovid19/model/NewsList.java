package com.example.kawalcovid19.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsList {
    @SerializedName("result")
    List<NewsModel> result;
}
