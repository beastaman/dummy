package com.asde.dbconnect.service;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
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
        List<VaccineSlot> data = frs.readVaccinCentreData(fileName);
        for(int i=0;i<data.size();i++)
        {
            if(data.get(i).isIs_available())
            {
                slots.add(data.get(i));
            }
        }
        return slots;
    }

    /**
     * Get the no of slots from the database for a specific vaccine and location
     * 
     * For example: gurgaon and covaxin
     */
    @Override
    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) {
        try {
            List<VaccineSlot> data = frs.readVaccinCentreData(fileName);
        for(int i=0;i<data.size();i++)
        {
            if(data.get(i).isIs_available() && data.get(i).getLocation_name().equalsIgnoreCase(location) && data.get(i).getVaccine_id().equalsIgnoreCase(vaccine_name))
            {
                return data.get(i).getSlot_id();
            }
        }
        } catch (Exception e) {
            //TODO: handle exception
            return 50;
        }
        
        return 0;
    }

    /**
     * Get the list of all slots that are available for a particular location
     * 
     * For example: gurgaon
     */
    @Override
    public List<VaccineSlot> getVaccineSlotsForLocation(String location) {
    	List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        List<VaccineSlot> data = frs.readVaccinCentreData(fileName);
        for(int i=0;i<data.size();i++)
        {
            if(data.get(i).getLocation_name().equalsIgnoreCase(location))
            {
                slots.add(data.get(i));
            }
        }
        return slots;
    }
    
}
