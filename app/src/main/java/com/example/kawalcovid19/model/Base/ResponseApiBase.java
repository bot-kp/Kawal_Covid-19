package com.example.kawalcovid19.model.Base;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

class ResultStructure<T> {
    @SerializedName("result")
    T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}

public class ResponseApiBase<T> {
    @SerializedName("success")
    Boolean success;
    @SerializedName("data")
    ResultStructure<T> data;

    public ResponseApiBase(){}

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ResultStructure getData() {
        return data;
    }

    public T getResult(){
        return data.getResult();
    }

    public void setData(T data) {
        this.data.setResult(data);
    }
}
