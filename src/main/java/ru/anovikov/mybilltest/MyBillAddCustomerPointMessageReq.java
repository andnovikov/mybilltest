package ru.anovikov.mybilltest;

import java.math.BigDecimal;
import java.util.Date;

public class MyBillAddCustomerPointMessageReq {

    /*
            "amount":200.00,
            "guid":"9803d32e-8fcd-4984-a736-9f02f726b3c0",
            "email":null,
            "phone":null,
            "uniqId":"12345678",
            "info":"Сообщение для покупателя"
            "showCount":3
            "showTill":"2019-10-23T18:25:43.511Z"
            "eventId":"123456",
            "eventDate":"2015-01-01T00:00:00+03",
            "eventType":"operation",
            "operationType":"purchase",
            "operationAmount":100.0000,
            "merchantName":"ЦУМ",
            "bankProduct":"Золотая карта"
            "mcc":"АЗС",
     */

    private BigDecimal amount;
    private String guid;
    private String email;
    private String phone;
    private String uniqId;
    private String info;
    private int showCount;
    private Date showTill;
    private String eventId;
    private Date eventDate;
    private String eventType;
    private String operationType;
    private BigDecimal operationAmount;
    private String merchantName;
    private String bankProduct;
    private String mcc;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
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

    public int getShowCount() {
        return showCount;
    }

    public void setShowCount(int showCount) {
        this.showCount = showCount;
    }

    public Date getShowTill() {
        return showTill;
    }

    public void setShowTill(Date showTill) {
        this.showTill = showTill;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public BigDecimal getOperationAmount() {
        return operationAmount;
    }

    public void setOperationAmount(BigDecimal operationAmount) {
        this.operationAmount = operationAmount;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getBankProduct() {
        return bankProduct;
    }

    public void setBankProduct(String bankProduct) {
        this.bankProduct = bankProduct;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }
}
