package com.asde.file;

import java.util.*;
import java.io.*;

import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {


	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType) {
        List<VaccineSlot> vs = readVaccinCentreData("/home/project/src/main/resources/vaccinecentredata.csv");
        int res = 0;
        for (VaccineSlot v: vs){
            if(v.getLocation() == location){
                res += v.getSlots();
            }
        }
        return res;
	}

	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) {
        List<VaccineSlot> res = new ArrayList<VaccineSlot>();
        String line = new String("");
        boolean avail;
        // int slots;
        try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while((line = br.readLine()) != null) {
                String cols[] = line.split(",");
                if(cols[2] == "true")avail = true;
                else avail = false;
                // slots = Integer.parse(cols[3]);
                VaccineSlot vs = new VaccineSlot(cols[0],cols[1],avail,Integer.parseInt(cols[3]));
                res.add(vs);
                
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
       return res;
	}

}