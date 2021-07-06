package com.asde.dbconnect.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        slots = frs.readVaccinCentreData(fileName);
        if(slots == null)
            return null;
        slots = slots.stream().filter((vaccineSlot) -> vaccineSlot.isIs_available()).collect(Collectors.toList());
        return slots;
    }

    /**
     * Get the no of slots from the database for a specific vaccine and location
     * 
     * For example: gurgaon and covaxin
     */
    @Override
    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) {
        return frs.getTotalSlotsForLocation(fileName, location, vaccine_name);
    }

    /**
     * Get the list of all slots that are available for a particular location
     * 
     * For example: gurgaon
     */
    @Override
    public List<VaccineSlot> getVaccineSlotsForLocation(String location) {
    	List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        slots = frs.readVaccinCentreData(fileName);
        if (slots == null)
            return null;
        slots = slots.stream().map((slot) -> {  // Direct filter was giving error
            if(slot.getLocation_name().equalsIgnoreCase(location))
                return slot;
            return null;
        })
        .filter((slot) -> (slot != null))
        .collect(Collectors.toList());
        
        return slots;
    }
    
}
