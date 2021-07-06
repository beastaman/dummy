package com.asde.file;

import java.util.*;

import com.asde.dbconnect.entities.*;

import java.io.*;

public class FileReadingServiceImpl implements IFileReadingService {

	@Override
    public Integer getTotalSlotsForLocation(String location, String vaccineType) {
		
		Integer total = 0;
		String line = "";
		String splitBy = ",";
		
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("src/main/resources/vaccinecentredata.csv"));
			boolean seen = false;

			while ((line = br.readLine()) != null) {
				if (!seen) {
					seen = true;
					continue;
				}

				String[] employee = line.split(splitBy);

				String name = employee[0].trim();
				String current_location = employee[1].trim();
				String availability = employee[2].trim().toLowerCase();
				String slot = employee[3].trim();
				
				System.out.println(Arrays.toString(employee));
				
				int a = 10;
				
				if (name.equals(vaccineType) && location.equals(current_location) && availability.equals("true")) {
					total += Integer.valueOf(slot);
				}
				int b = 10;
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return total;
	}
	
	
	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) {

		List<VaccineSlot> total = new ArrayList<>();
		String line = "";
		String splitBy = ",";
		
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(filename));
			boolean seen = false;

			while ((line = br.readLine()) != null) {
				if (!seen) {
					seen = true;
					continue;
				}

				String[] employee = line.split(splitBy);

				String name = employee[0].substring(1).trim();
				String current_location = employee[1].trim();
				String availability = employee[2].trim();
				String slot = employee[3].trim();
				
				total.add(new VaccineSlot(Integer.parseInt(slot),  current_location , name , (availability.equals("true") ? true : false) ));

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return total;
	}
	
	@Override
	public List<VaccineSlot> getVaccinationCentersForLocation(String location, String file) {

		List<VaccineSlot> total = new ArrayList<>();
		String line = "";
		String splitBy = ",";
		
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(file));
			boolean seen = false;

			while ((line = br.readLine()) != null) {
				if (!seen) {
					seen = true;
					continue;
				}

				String[] employee = line.split(splitBy);

				String name = employee[0].substring(1).trim();
				String current_location = employee[1].trim();
				String availability = employee[2].trim();
				String slot = employee[3].trim();
				
				if(current_location.equals(location)) {
					total.add(new VaccineSlot(Integer.parseInt(slot),  current_location , name , (availability.equals("true") ? true : false) ));

				}				

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return total;
	}
	
	
	@Override
	public List<Vaccine> readAllVaccines(String filename){

		List<Vaccine> total = new ArrayList<>();
		String line = "";
		String splitBy = ",";
		
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(filename));
			boolean seen = false;

			while ((line = br.readLine()) != null) {
				if (!seen) {
					seen = true;
					continue;
				}

				String[] employee = line.split(splitBy);

				String name = employee[0].trim();
				
				total.add(new Vaccine(name));

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return total;
	}


}
