package com.asde.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {

	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType, String filename) {
		File myFile = new File(filename);
		int c = 0; //count variable
		try {
			Scanner scn = new Scanner(myFile);
			while (scn.hasNextLine()) {
				String line = scn.nextLine();
				String[] arr = line.split(",");
				if (arr[0].equals(vaccineType) && arr[1].equals(location) && arr[3] == "true") {
					c += Integer.parseInt(arr[3]);
				}
			}
			scn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return Integer.valueOf(c);
	}

	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) {
		// TODO Auto-generated method stub
		File myFile = new File(filename);
		List<VaccineSlot> list = new ArrayList<>();

		try {
			Scanner scn = new Scanner(myFile);
			while (scn.hasNextLine()) {
				String line = scn.nextLine();
				String[] arr = line.split(",");
				if (arr[0].equals("vaccinetype") == false) {
					VaccineSlot vaccineSlot = new VaccineSlot();
					vaccineSlot.setLocation_name(arr[1]);
					if (Integer.parseInt(arr[3]) > 0) {
						vaccineSlot.setIs_available(true);
					} else {
						vaccineSlot.setIs_available(false);
					}
					list.add(vaccineSlot);
				}
				System.out.println(line);
			}
			scn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

}
