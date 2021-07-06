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
        List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
         String str = this.fileName;
        String[] array1 = str.split("\\r?\\n");
        
        for(int i = 1;i < array1.length;i++) {
            String[] array2 = array1[i].split(",");
            if((int)(array2[4]) > 0){
                VaccineSlot vaccineslot = new VaccineSlot();
                vaccineslot.setSlot_id((int)(array2[0]));
                vaccineslot.setLocation_name(array2[1]);
                vaccineslot.setVaccine_id(array2[2]);
                vaccineslot.setIs_available((boolean)(array2[3]));

                slots.add(vaccineslot);
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
        // TODO Auto-generated method stub
        Integer count = 0;
        String str = this.fileName;
        String[] array1 = str.split("\\r?\\n");
        
        for(int i = 1;i < array1.length;i++) {
            String[] array2 = array1[i].split(",");
            if(array2[1] == location && array2[0] == vaccine_name) count++;
        }

        return count;
    }

    /**
     * Get the list of all slots that are available for a particular location
     * 
     * For example: gurgaon
     */
    @Override
    public List<VaccineSlot> getVaccineSlotsForLocation(String location) {
        List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        String str = this.fileName;
        String[] array1 = str.split("\\r?\\n");
        
        for(int i = 1;i < array1.length;i++) {
            String[] array2 = array1[i].split(",");
            if(array2[1] == location){
                VaccineSlot vaccineslot = new VaccineSlot();
                vaccineslot.setSlot_id((int)(array2[0]));
                vaccineslot.setLocation_name(array2[1]);
                vaccineslot.setVaccine_id(array2[2]);
                vaccineslot.setIs_available((boolean)(array2[3]));

                slots.add(vaccineslot);
            }
        }
        return slots;
    }
    
}
