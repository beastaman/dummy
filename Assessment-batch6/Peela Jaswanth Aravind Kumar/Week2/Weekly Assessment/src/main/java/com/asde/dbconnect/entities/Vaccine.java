package com.asde.dbconnect.entities;


public class Vaccine {

    private String vaccine_name;
    private String manufacturer;
    private int efficiency;
    
    public Vaccine(String vaccine_name, String manufacturer, int efficiency){
        this.vaccine_name = vaccine_name;
        this.efficiency = efficiency;
        this.manufacturer = manufacturer;
    }

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

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

}
