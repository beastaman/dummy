package com.asde.dbconnect.service;

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
        List<VaccineSlot> slots = frs.readVaccinCentreData(fileName);
        return slots.stream().filter(VaccineSlot::isIs_available).collect(Collectors.toList());
    }

    /**
     * Get the no of slots from the database for a specific vaccine and location
     * 
     * For example: gurgaon and covaxin
     */
    @Override
    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) {
        List<VaccineSlot> slots = frs.readVaccinCentreData(fileName);
        return (Integer)slots.stream()
        .filter(s -> s.getLocation_name().equals(location) && s.getVaccine_id().equals(vaccine_name))
        .mapToInt(s -> s.getSlot_id())
        .sum();
    }

    /**
     * Get the list of all slots that are available for a particular location
     * 
     * For example: gurgaon
     */
    @Override
    public List<VaccineSlot> getVaccineSlotsForLocation(String location) {
    	List<VaccineSlot> slots = frs.readVaccinCentreData(fileName);
        return slots.stream()
        .filter(s -> s.getLocation_name()
        .equals(location))
        .collect(Collectors.toList());
    }
    
}
