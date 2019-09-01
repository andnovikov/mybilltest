package ru.anovikov.mybilltest;

import java.util.List;

public class MyBillAddBonusCommandReq {
    public List<MyBillAddBonusReq> getAdd() {
        return add;
    }

    public void setAdd(List<MyBillAddBonusReq> add) {
        this.add = add;
    }

    public String getTypeOfCommand() {
        return typeOfCommand;
    }

    public void setTypeOfCommand(String typeOfCommand) {
        this.typeOfCommand = typeOfCommand;
    }

    private List<MyBillAddBonusReq> add;
    private String typeOfCommand = "addBonus";
}
