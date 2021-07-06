package com.spaient.entity;

public class Parcel {
    Integer customerId;
    Integer branchId;
    DeliveryStatus status;
    Integer parcelId;

    public Parcel() {
    }

    public Parcel(Integer customerId, Integer branchId, DeliveryStatus status) {
        this.customerId = customerId;
        this.branchId = branchId;
        this.status = status;
    }

    public Parcel(Integer customerId, Integer branchId, DeliveryStatus status, Integer parcelId) {
        this.customerId = customerId;
        this.branchId = branchId;
        this.status = status;
        this.parcelId = parcelId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    public Integer getParcelId() {
        return parcelId;
    }

    public void setParcelId(Integer parcelId) {
        this.parcelId = parcelId;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "customerId=" + customerId +
                ", branchId=" + branchId +
                ", status='" + status.name() + '\'' +
                '}';
    }
}
