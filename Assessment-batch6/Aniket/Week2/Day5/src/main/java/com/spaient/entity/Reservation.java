package com.spaient.entity;

public class Reservation {
    Integer customerId;
    Integer tableId;
    Integer reservationId;

    public Reservation() {
    }

    public Reservation(Integer customerId, Integer tableId) {
        this.customerId = customerId;
        this.tableId = tableId;
    }

    public Reservation(Integer customerId, Integer tableId, Integer reservationId) {
        this.customerId = customerId;
        this.tableId = tableId;
        this.reservationId = reservationId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customerId=" + customerId +
                ", tableId=" + tableId +
                ", reservationId=" + reservationId +
                '}';
    }
}
