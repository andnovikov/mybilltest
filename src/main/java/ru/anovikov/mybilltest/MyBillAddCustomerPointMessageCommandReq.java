package ru.anovikov.mybilltest;

import java.util.List;

public class MyBillAddCustomerPointMessageCommandReq {

    public List<MyBillAddCustomerPointMessageReq> getAdd() {
        return add;
    }

    public void setAdd(List<MyBillAddCustomerPointMessageReq> add) {
        this.add = add;
    }

    public String getTypeOfCommand() {
        return typeOfCommand;
    }

    public void setTypeOfCommand(String typeOfCommand) {
        this.typeOfCommand = typeOfCommand;
    }

    private List<MyBillAddCustomerPointMessageReq> add;
    private String typeOfCommand = "addCustomerPointMessage";
}
