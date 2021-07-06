package com.asde.dbconnect.entities;


public class Vaccine {

    private String vaccine_name;
    private String manufacturer;
    private int efficacy;

	public String getVaccine_name() {
		return vaccine_name;
	}

	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getEfficacy() {
        return efficacy;
    }

    public void setEfficacy(int efficacy) {
        this.efficacy = efficacy;
    }

}
