package com.spaient.entity;

public class Branch {
    String location;
    String contact;
    Integer branchId;

    public Branch() {
    }

    public Branch(String location, String contact, Integer branchId) {
        this.location = location;
        this.contact = contact;
        this.branchId = branchId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "location='" + location + '\'' +
                ", contact='" + contact + '\'' +
                ", branchId=" + branchId +
                '}';
    }
}
