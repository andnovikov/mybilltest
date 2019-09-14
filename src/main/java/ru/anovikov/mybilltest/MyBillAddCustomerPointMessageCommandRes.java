package ru.anovikov.mybilltest;

import java.util.List;

public class MyBillAddCustomerPointMessageCommandRes {
    // {"results":[],"status":"Success","error":null}

    public List<MyBillAddCustomerPointMessageRes> getResults() {
        return results;
    }

    public void setResults(List<MyBillAddCustomerPointMessageRes> results) {
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

    private List<MyBillAddCustomerPointMessageRes> results;
    private String status;
    private String error;

}
