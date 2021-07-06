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
        frs = new FileReadingServiceImpl();
        List<VaccineSlot> slots = frs.readVaccinAvailableCentreData("/Users/nikhil/Documents/project/src/main/resources/vaccinecentredata.csv");
        return slots;
    }

    /**
     * Get the no of slots from the database for a specific vaccine and location
     *
     * For example: gurgaon and covaxin
     */
    @Override
    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) {
        IFileReadingService fs = new FileReadingServiceImpl();
        return fs.getTotalSlotsForLocation(location, vaccine_name);
    }

    /**
     * Get the list of all slots that are available for a particular location
     *
     * For example: gurgaon
     */
    @Override
    public List<VaccineSlot> getVaccineSlotsForLocation(String location) {
        String line="";
        List<VaccineSlot> result = new ArrayList<>();
        boolean seen=true;
        try{
            BufferedReader br = new BufferedReader(new FileReader("/Users/nikhil/Documents/project/src/main/resources/vaccinecentredata.csv"));
            while((line=br.readLine())!=null){
                String[] data = line.split(",");
                if(seen){
                    seen=false;
                    continue;
                }
                if(data[1].equals(location)){
                    VaccineSlot vs = new VaccineSlot();
                    vs.setIs_available(Boolean.parseBoolean(data[3]));
                    vs.setLocation_name(data[1]);
                    vs.setSlot_id(Integer.parseInt(data[3]));
                    vs.setVaccine_id(data[0]);
                    result.add(vs);
                }

            }
        }catch(IOException e){

        }
        return result;
    }

}
