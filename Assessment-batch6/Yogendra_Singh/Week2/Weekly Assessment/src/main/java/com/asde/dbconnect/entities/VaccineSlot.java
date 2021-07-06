package com.asde.dbconnect.entities;

public class VaccineSlot {
	
	private int slot_id; 
	private String location_name;
	private String vaccine_id;
	private boolean is_available;

	public int getSlot_id() {
		return slot_id;
	}
	public void setSlot_id(int slot_id) {
		this.slot_id = slot_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public String getVaccine_id() {
		return vaccine_id;
	}
	public void setVaccine_id(String vaccine_id) {
		this.vaccine_id = vaccine_id;
	}
	public boolean isIs_available() {
		return is_available;
	}
	public void setIs_available(boolean is_available) {
		this.is_available = is_available;
	} 
}
