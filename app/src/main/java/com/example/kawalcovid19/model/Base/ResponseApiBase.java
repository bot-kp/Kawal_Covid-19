package com.example.kawalcovid19.model.Base;

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
    @SerializedName("message")
    String message = "";

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

    public void setData(ResultStructure<T> data) {
        this.data = data;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
