package com.asde.dbconnect.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

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
        //List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        List<VaccineSlot> allslots = frs.readVaccinCentreData(this.fileName);
        for(VaccineSlot slot: allslots)
        {
            if(slot.isIs_available() == true)
            slots.add(slot);
        }
        return slots;
        //slots.add(null);
        //return slots;
    }

    /**
     * Get the no of slots from the database for a specific vaccine and location
     * 
     * For example: gurgaon and covaxin
     */
    @Override
    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) {
        // TODO Auto-generated method stub
        //return 50;
        List<VaccineSlot> slots = frs.readVaccinCentreData(this.fileName);
        int count=0;
        for(VaccineSlot slot: slots)
        {
            if(slot.getLocation_name()==location && slot.getVaccine_id()==vaccine_name )
                count+= slot.getSlot_id();
        }
        return Integer.valueOf(count);
    }

    /**
     * Get the list of all slots that are available for a particular location
     * 
     * For example: gurgaon
     */
    @Override
    public List<VaccineSlot> getVaccineSlotsForLocation(String location) {
    	// List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        // slots.add(null);
        // return slots;
        List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        List<VaccineSlot> allslots = frs.readVaccinCentreData(this.fileName);
        for(VaccineSlot slot: allslots)
        {
            if(slot.getLocation_name() == location)
            slots.add(slot);
        }
        return slots;
    }
    
}
