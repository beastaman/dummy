
package com.asde.dbconnect.entities;

public class VaccineSlot {
	
	private String vaccinetype; 
	private String location;
	private boolean availability;
	private int slots;

    public VaccineSlot(String vaccinetype,String location,boolean availability,int slots){
        this.vaccinetype = vaccinetype;
        this.location = location;
        this.availability = availability;
        this.slots = slots;
    }
    public String getVaccinetype() {
        return vaccinetype;
    }

    public void setVaccinetype(String vaccinetype) {
        this.vaccinetype = vaccinetype;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

      

	
}