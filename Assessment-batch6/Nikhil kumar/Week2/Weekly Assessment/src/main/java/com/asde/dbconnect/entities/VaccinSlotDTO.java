package com.asde.dbconnect.entities;

public class VaccinSlotDTO {
    private String vaccinType;
    private String location;
    private Boolean availability;
    private Integer slots;

    public VaccinSlotDTO(String vaccinType, String location, Boolean availability, Integer slots) {
        this.vaccinType = vaccinType;
        this.location = location;
        this.availability = availability;
        this.slots = slots;
    }

    public String getVaccinType() {
        return vaccinType;
    }

    public void setVaccinType(String vaccinType) {
        this.vaccinType = vaccinType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Integer getSlots() {
        return slots;
    }

    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "VaccinSlotDTO{" +
                "vaccinType='" + vaccinType + '\'' +
                ", location='" + location + '\'' +
                ", availability=" + availability +
                ", slots=" + slots +
                '}';
    }
}