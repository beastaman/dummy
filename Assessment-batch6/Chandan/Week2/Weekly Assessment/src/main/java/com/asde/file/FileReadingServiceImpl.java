package com.asde.file;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.asde.dbconnect.entities.Vaccine;
import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {


	public Integer getTotalSlotsForLocation(String filename, String location, String vaccineType) throws Exception {
		
		Scanner scanner = new Scanner(new File(filename));
        
		int total = 0;
		
        scanner.nextLine();
        while(scanner.hasNext()){

            String row = scanner.nextLine();
            String centerData[] = row.split(",");
            
            
            if(centerData[1].equalsIgnoreCase(location) && centerData[0].equalsIgnoreCase(vaccineType)) {
            	total += Integer.parseInt(centerData[3]);
            }

        }
		
		
		return total;
		
	}

	public List<VaccineSlot> readVaccinCentreData(String filename) throws Exception {
        
        List<VaccineSlot> vaccineSlots = new ArrayList<VaccineSlot>();

        Scanner scanner = new Scanner(new File(filename));
        
        scanner.nextLine();
        while(scanner.hasNext()){

            String row = scanner.nextLine();
            String centerData[] = row.split(",");

            VaccineSlot vs = new VaccineSlot();
            vs.setLocation_name(centerData[1]);
            vs.setVaccine_id(centerData[0]);
            if(centerData[2].equalsIgnoreCase("true")){
                vs.setIs_available(true);
            }else{
                vs.setIs_available(false);
            }


            vaccineSlots.add(vs);

        }
        
//        System.out.println("no: " + vaccineSlots.size());
        

		return vaccineSlots;
    }

    public List<Vaccine> getVaccineData(String filename) throws Exception{
        List<Vaccine> vaccines = new ArrayList<>();
        
        Scanner scanner = new Scanner(new File(filename));
        
        scanner.nextLine();
        while(scanner.hasNext()){

            String row = scanner.nextLine();
            String vaccineData[] = row.split(",");

            Vaccine vaccine = new Vaccine();
            vaccine.setVaccine_name(vaccineData[0].trim());
            
            vaccines.add(vaccine);

        }
        
        return vaccines;
        
    }
    	
	

}
