package com.asde.dbconnect.entities;

public class VaccinDataDTO {
    private String vaccinName;
    private String manufacture;
    private String efficacy;

    public VaccinDataDTO(String vaccinName, String manufacture, String efficacy) {
        this.vaccinName = vaccinName;
        this.manufacture = manufacture;
        this.efficacy = efficacy;
    }

    public String getVaccinName() {
        return vaccinName;
    }

    public void setVaccinName(String vaccinName) {
        this.vaccinName = vaccinName;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getEfficacy() {
        return efficacy;
    }

    public void setEfficacy(String efficacy) {
        this.efficacy = efficacy;
    }

    @Override
    public String toString() {
        return "VaccinDataDTO{" +
                "vaccinName='" + vaccinName + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", efficacy='" + efficacy + '\'' +
                '}';
    }
}

