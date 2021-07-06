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

    
    @Override
    public List<VaccineSlot> getAllAvailableSlots() {
        List<VaccineSlot> slots = frs.readVaccinCentreData(fileName);
        return slots;
    }

    
    /**
     * Get the no of slots from the database for a specific vaccine and location
     * 
     * For example: gurgaon and covaxin
     */
    @Override
    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) {
    	return frs.getTotalSlotsForLocation(location, vaccine_name);
    }

    /**
     * Get the list of all slots that are available for a particular location
     * 
     * For example: gurgaon
     */
    @Override
    public List<VaccineSlot> getVaccineSlotsForLocation(String location) {
    	List<VaccineSlot> slots = frs.getVaccinationCentersForLocation(location, fileName);
        return slots;
    }
    
}
