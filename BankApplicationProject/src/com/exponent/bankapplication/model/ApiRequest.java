package com.exponent.bankapplication.model;

public class ApiRequest {
    private String data;
    private String sign;

    public ApiRequest() {}

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}