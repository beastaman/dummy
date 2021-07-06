package com.asde.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {


	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType) {
        Integer totalSlotsForLocation = 0;
        
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/vaccinecentredata.csv"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // vaccinetype,location,availability,slots
                String[] row = line.split(",");
                if (row[0].equals(vaccineType) && row[1].equals(location)) {
                    totalSlotsForLocation += Integer.parseInt(row[3]);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalSlotsForLocation;
	}

	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) {
        List<VaccineSlot> vaccineSlots = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;
            boolean first = true;
            while ((line = bufferedReader.readLine()) != null) {
                if (first) {
                    first = false;
                    continue;
                }
                // vaccinetype,location,availability,slots
                String[] row = line.split(",");
                // slot_id int, location_name String, vaccine_id String, is_available boolean
                VaccineSlot curVaccineSlot = new VaccineSlot();
                curVaccineSlot.setSlot_id(Integer.parseInt(row[3]));
                curVaccineSlot.setLocation_name(row[1]);
                curVaccineSlot.setVaccine_id(row[0]);
                curVaccineSlot.setIs_available((boolean)(Boolean.parseBoolean(row[2])));
                vaccineSlots.add(curVaccineSlot);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return vaccineSlots;
	}

}
