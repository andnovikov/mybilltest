package ru.anovikov.mybilltest;

import java.util.List;

public class MyBillAddBonusExtQuickCommandReq {

    public List<MyBillAddBonusExtQuickReq> getAdd() {
        return add;
    }

    public void setAdd(List<MyBillAddBonusExtQuickReq> add) {
        this.add = add;
    }

    public String getTypeOfCommand() {
        return typeOfCommand;
    }

    public void setTypeOfCommand(String typeOfCommand) {
        this.typeOfCommand = typeOfCommand;
    }

    private List<MyBillAddBonusExtQuickReq> add;
    private String typeOfCommand = "addBonusExtQuick";
}
