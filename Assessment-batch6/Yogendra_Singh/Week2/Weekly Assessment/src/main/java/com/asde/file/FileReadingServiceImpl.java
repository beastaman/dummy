package com.asde.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {


	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType) {
      //  return null;
      List<VaccineSlot> vaccineSlots = new ArrayList<>();
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/vaccinecentredata.csv"));
            String s;
            while((s= bufferedReader.readLine())!=null )
            {
                String[] col = s.split(",");
                VaccineSlot slot = new VaccineSlot();
                slot.setIs_available((boolean) Boolean.parseBoolean(col[2]));
                slot.setLocation_name(col[1]);
                slot.setVaccine_id(col[0]);
                slot.setSlot_id(Integer.parseInt(col[0]));
                //System.out.println( slot.getLocation_name() + " " + slot.isIs_available() );
                vaccineSlots.add(slot);
            }
            bufferedReader.close();
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
        int count=0;
        for(VaccineSlot slot: vaccineSlots)
        {
            if(slot.getLocation_name()==location && slot.getVaccine_id()==vaccineType )
                count+= slot.getSlot_id();
        }
        System.out.println("count of slot is : " + count);
        return Integer.valueOf(count);
	}

	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) {
		// TODO Auto-generated method stub
        //return null;
          // TODO Auto-generated method stub
          //Scanner scanner = new Scanner(new File("vaccinecentredata.csv"));
        //scanner.delimiter(",");
        //scanner.next();
        List<VaccineSlot> vaccineSlots = new ArrayList<>();
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String s;
            while((s= bufferedReader.readLine())!=null )
            {
                String[] col = s.split(",");
                VaccineSlot slot = new VaccineSlot();
                slot.setIs_available((boolean) Boolean.parseBoolean(col[2]));
                slot.setLocation_name(col[1]);
                slot.setVaccine_id(col[0]);
                slot.setSlot_id(Integer.parseInt(col[0]));
                //System.out.println( slot.getLocation_name() + " " + slot.isIs_available() );
                vaccineSlots.add(slot);
            }
            bufferedReader.close();
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
		return vaccineSlots;
	}

}
