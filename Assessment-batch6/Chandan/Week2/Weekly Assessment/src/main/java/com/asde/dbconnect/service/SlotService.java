package com.asde.dbconnect.service;

import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.VaccineSlot;
import com.asde.file.IFileReadingService;

public class SlotService implements ISlotService {

    private IFileReadingService frs;
    private String fileName;

    public SlotService(IFileReadingService frs, String fileName) {
        this.frs = frs;
        this.fileName = fileName;
    }

    /**
     * Get all available slots that are present in the file as a list of objects 
     * containing the location for each slot as well
     */
    public List<VaccineSlot> getAllAvailableSlots(){
        List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        
        try{
            slots = this.frs.readVaccinCentreData(this.fileName);

        }
        catch(Exception e){
        	System.out.println(e.getMessage());
            return null;
        }

        return slots;
    }

    /**
     * Get the no of slots from the database for a specific vaccine and location
     * 
     * For example: gurgaon and covaxin
     */
    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) {
        int locationSlots = 0;
        try{
            locationSlots = this.frs.getTotalSlotsForLocation(this.fileName, location, vaccine_name);
        }
        catch(Exception e){
            return null;
        }

        return locationSlots;
    }

    /**
     * Get the list of all slots that are available for a particular location
     * 
     * For example: gurgaon
     */
    public List<VaccineSlot> getVaccineSlotsForLocation(String location){
        List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        try{
            
            List<VaccineSlot> allSlots = this.frs.readVaccinCentreData(this.fileName);

            for(VaccineSlot slotObj: allSlots){
                if(slotObj.getLocation_name().equals(location)){
                    slots.add(slotObj);
                }
            }
        }
        catch(Exception e){
            return null;
        }

        return slots;
    }
    
}
