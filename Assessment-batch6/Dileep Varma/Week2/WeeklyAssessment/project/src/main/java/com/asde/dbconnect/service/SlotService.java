package com.asde.dbconnect.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.VaccineSlot;
import com.asde.file.FileReadingServiceImpl;
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
        IFileReadingService service = new FileReadingServiceImpl();
        try {
            slots = service.readVaccinCentreData("/home/project/src/main/resources/vaccinecentredata.csv");
        } catch (Exception e) {
            e.printStackTrace();
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
        IFileReadingService service = new FileReadingServiceImpl();
        try {
            return service.getTotalSlotsForLocation(location, vaccine_name);
        } catch (Exception e) {
            e.printStackTrace();
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
        String line = "";
		String splitBy = ",";
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/project/src/main/resources/vaccinecentredata.csv"));
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] vaccineData = line.split(splitBy);
				VaccineSlot temp = new VaccineSlot();
				temp.setIs_available(Boolean.parseBoolean(vaccineData[2]));
				temp.setLocation_name(vaccineData[1]);
				temp.setSlot_id(Integer.parseInt(vaccineData[3]));
                temp.setVaccine_id(vaccineData[0]);
                if(temp.getLocation_name().equals(location)){
                    slots.add(temp);
                }        
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
        return slots;
    }
    
}