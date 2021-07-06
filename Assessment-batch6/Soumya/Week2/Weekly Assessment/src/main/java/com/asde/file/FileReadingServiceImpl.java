package com.asde.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {


	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType) throws Exception {
		String line = "";
		String splitBy = ",";

		try {
			BufferedReader br = new BufferedReader(
					new FileReader("/home/project/src/main/resources/vaccinecentredata.csv"));
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] vaccineData = line.split(splitBy);
				if (location.equals(vaccineData[1]) && vaccineType.equals(vaccineData[0]))
					return Integer.parseInt(vaccineData[3]);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) throws Exception {
		List<VaccineSlot> vaccineCentreData = new ArrayList<>();
		String line = "";
		String splitBy = ",";
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				String[] vaccineData = line.split(splitBy);
				VaccineSlot temp = new VaccineSlot();
				temp.setIs_available(Boolean.parseBoolean(vaccineData[2]));
				temp.setLocation_name(vaccineData[1]);
				temp.setSlot_id(Integer.parseInt(vaccineData[3]));
				temp.setVaccine_id(vaccineData[0]);
				vaccineCentreData.add(temp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return vaccineCentreData;
	}

}
