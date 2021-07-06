package com.asde.dbconnect.entities;


public class Vaccine {

    private String vaccinename;
    private String manufacturer;
    private String efficacy;

    public Vaccine(){

    }

    public Vaccine(String vaccinename,String manufacturer,String efficacy){
        this.efficacy=efficacy;
        this.vaccinename=vaccinename;
        this.manufacturer=manufacturer;
    }
    public String getVaccinename() {
        return vaccinename;
    }

    public void setVaccinename(String vaccinename) {
        this.vaccinename = vaccinename;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getEfficacy() {
        return efficacy;
    }

    public void setEfficacy(String efficacy) {
        this.efficacy = efficacy;
    }

    

}
