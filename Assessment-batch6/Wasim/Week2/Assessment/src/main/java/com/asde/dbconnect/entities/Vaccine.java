package com.asde.dbconnect.entities;


public class Vaccine {

	private String vaccine_name;

	public Vaccine() {
		
	}
	
	public Vaccine(String name) {
		this.vaccine_name = name;
	}
	
	public String getVaccine_name() {
		return vaccine_name;
	}

	public void setVaccine_name(String vaccine_name) {
		this.vaccine_name = vaccine_name;
	}

}
