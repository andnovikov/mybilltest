package ru.anovikov.mybilltest;

import java.util.List;

public class MyBillAddBonusCommandRes {
    // {"results":[],"status":"Success","error":null}

    public List<MyBillAddBonusRes> getResults() {
        return results;
    }

    public void setResults(List<MyBillAddBonusRes> results) {
        this.results = results;
    }

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

    private List<MyBillAddBonusRes> results;
    private String status;
    private String error;

}
