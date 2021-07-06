package com.asde.file;

import java.util.List;

import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {


	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType) {
        String str = this.fileName;
        Integer count = 0;
        String[] array1 = str.split("\\r?\\n");
        
        for(int i = 1;i < array1.length;i++) {
            String[] array2 = array1[i].split(",");
            if(array2[1] == location && array2[0] == vaccineType) count++;
        }


        return count;
	}

	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) {
        String str = this.fileName;
        List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        String[] array1 = str.split("\\r?\\n");
        
        for(int i = 1;i < array1.length;i++) {
            String[] array2 = array1[i].split(",");
            VaccineSlot vaccineslot = new VaccineSlot();
            vaccineslot.setSlot_id((int)(array2[0]));
            vaccineslot.setLocation_name(array2[1]);
            vaccineslot.setVaccine_id(array2[2]);
            vaccineslot.setIs_available((boolean)(array2[3]));

            slots.add(vaccineslot);
        }

        return slots;
	}

}
