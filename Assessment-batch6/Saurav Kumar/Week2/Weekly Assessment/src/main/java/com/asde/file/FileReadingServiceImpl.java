package com.asde.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {

    @Override
    public Integer getTotalSlotsForLocation(String location, String vaccineType) {
        
        FileReadingServiceImpl fr = new FileReadingServiceImpl();
        String filename = "";
        List<VaccineSlot> vaccineSlots = fr.readVaccinCentreData(filename);
        for(VaccineSlot vs : vaccineSlots) {
            if(vs.getLocation_name().equals(location) && 
                vs.getVaccine_id().equals(vaccineType)) {

                return vs.getSlot_id();
            }
        }

        return 0;

    }

    @Override
    public List<VaccineSlot> readVaccinCentreData(String filename) {
        String s = "/home/project/src/main/resources/vaccinecentredata.csv";
        List<VaccineSlot> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while((s = br.readLine())!=null) {
                String arr[] = s.split(",");

                int slot_id = Integer.parseInt(arr[3]);
                String loc_name = arr[1];
                String vaccine_id = arr[0];
                Boolean is_available = Boolean.parseBoolean(arr[2]);

                VaccineSlot vaccineSlot = new VaccineSlot();
                vaccineSlot.setSlot_id(slot_id);
                vaccineSlot.setLocation_name(loc_name);
                vaccineSlot.setVaccine_id(vaccine_id);
                vaccineSlot.setIs_available(is_available);

                list.add(vaccineSlot);

            } 
        } catch (IOException e) {

        }
        
		return list;
	}

}
