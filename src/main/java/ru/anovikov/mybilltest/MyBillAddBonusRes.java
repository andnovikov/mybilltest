package ru.anovikov.mybilltest;

public class MyBillAddBonusRes {
    // {"login":"+79777573300","balance":2300.0000,"status":"Success","error":null}

    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
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

    private float balance;
    private String status;
    private String error;
}
