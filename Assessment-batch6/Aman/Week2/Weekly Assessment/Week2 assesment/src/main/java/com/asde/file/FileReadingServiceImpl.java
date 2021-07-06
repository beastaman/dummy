package com.asde.file;

import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {


	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType) {
        Integer total = 0;String string =this.filename;
        String[] arr = string.split("\\r?\\n");
        for(int i = 1;i < arr.length;++i) {
            String[] brr = arr[i].split(",");
            if(brr[1] == location && brr[0] == vaccineType){
                ++total;
            }
        }
        return total;
	}

	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) {
		String str = this.filename;
        List<VaccineSlot> lists = new ArrayList()<VaccineSlot>();
        String[] arr = str.split("\\r?\\n");
        for(int i = 1;i < array1.length;++i) {
            String[] brr = arr[i].split(",");
            VaccineSlot vslot = new VaccineSlot();
            vslot.setLocation_name(brr[1]);vslot.setVaccine_id(brr[2]);
            vslot.setSlot_id((int)(brr[0]));vslot.setIs_available((boolean)(brr[3]));
            lists.add(vslot);
        }
        return lists;
	}

}
