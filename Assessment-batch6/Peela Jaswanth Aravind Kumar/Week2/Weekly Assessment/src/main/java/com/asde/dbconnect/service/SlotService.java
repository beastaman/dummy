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
    @Override
    public List<VaccineSlot> getAllAvailableSlots() {
        List<VaccineSlot> res = new ArrayList<VaccineSlot>();
        List<VaccineSlot>vs = frs.readVaccinCentreData(fileName);
        
        for (VaccineSlot v: vs){
            if(v.getSlots() > 0){
                res.add(v);
            }
        }
        return res;
        
    }

    /**
     * Get the no of slots from the database for a specific vaccine and location
     * 
     * For example: gurgaon and covaxin
     */
    @Override
    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) {

        List<VaccineSlot>vs = frs.readVaccinCentreData(fileName);

        for(VaccineSlot v: vs){
            if(v.getLocation() == location && v.getVaccinetype() == vaccine_name){
                return v.getSlots();
            }
        }
        return 50;
    }

    /**
     * Get the list of all slots that are available for a particular location
     * 
     * For example: gurgaon
     */
    @Override
    public List<VaccineSlot> getVaccineSlotsForLocation(String location) {
    	List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        List<VaccineSlot>vs = frs.readVaccinCentreData(fileName);

        for(VaccineSlot v: vs){
            if(v.getLocation() == location){
                slots.add(v);
            }
        }
        return slots;
    }
    
}