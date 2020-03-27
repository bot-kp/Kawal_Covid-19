package com.example.kawalcovid19.model.statistics;

import com.google.gson.annotations.SerializedName;

class ResultStructure {
    @SerializedName("result")
    Statistics result;

    public Statistics getResult() {
        return result;
    }

    public void setResult(Statistics result) {
        this.result = result;
    }
}

public class GetStatistics {
    @SerializedName("success")
    Boolean success;
    @SerializedName("data")
    ResultStructure data;

    public Statistics getStatistics(){
        return data.getResult();
    }

    public void setStatistics(Statistics dataStatistics){
        data.setResult(dataStatistics);
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ResultStructure getData() {
        return data;
    }

    public void setData(ResultStructure data) {
        this.data = data;
    }
}