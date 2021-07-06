package com.asde.file;

import java.util.*;

import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {


	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType) {
       
		return 50;
	}

	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) {
        // TODO Auto-generated method stub
        List<VaccineSlot> sList = new ArrayList<>();
        System.out.println(filename);

        return sList;
		
	}

}
