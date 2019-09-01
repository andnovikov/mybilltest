package ru.anovikov.mybilltest;

public class MyBillCommandRes {

    // {"data":"{}","status":"Success","error":null}

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private String data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    private String status;
    private String error;
}