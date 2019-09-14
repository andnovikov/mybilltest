package ru.anovikov.mybilltest;

public class MyBillAddBonusExtQuickRes {
    // {"login":"+79777573300","guid":"46f24f15-a399-4fc1-822e-46840ec4d4e3","status":"Success","error":null}

    private String login;
    private String guid;
    private String status;
    private String error;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getGuid() { return guid; }

    public void setGuid(String guid) { this.guid = guid; }

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

}
