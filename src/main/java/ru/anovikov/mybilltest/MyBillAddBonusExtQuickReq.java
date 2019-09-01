package ru.anovikov.mybilltest;

public class MyBillAddBonusExtQuickReq {

    /*
        "amount":200.00,
        "guid":"9803d32e-8fcd-4984-a736-9f02f726b3c0",
        "email":null,
        "phone":null,
        "uniqId":"12345678",
        "info":"Дополнительная информация"
    */

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUniqId() {
        return uniqId;
    }

    public void setUniqId(String uniqId) {
        this.uniqId = uniqId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private float amount;
    private String guid;
    private String email;
    private String phone;
    private String uniqId;
    private String info;
}