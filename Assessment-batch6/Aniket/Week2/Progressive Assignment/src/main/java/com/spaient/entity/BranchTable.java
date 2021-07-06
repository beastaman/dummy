package com.spaient.entity;

public class BranchTable {
    TableStatus tableStatus;
    Integer tableId;
    Integer branchId;
    Integer tableNumber;

    public BranchTable() {
    }

    public BranchTable(TableStatus tableStatus, Integer tableId, Integer branchId, Integer tableNumber) {
        this.tableStatus = tableStatus;
        this.tableId = tableId;
        this.branchId = branchId;
        this.tableNumber = tableNumber;
    }

    public TableStatus getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public String toString() {
        return "BranchTable{" +
                "tableStatus='" + tableStatus.name() + '\'' +
                ", tableId=" + tableId +
                ", branchId=" + branchId +
                '}';
    }
}
