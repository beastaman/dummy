package com.asde.dbconnect.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.Vaccine;
import com.asde.file.IFileReadingService;

public class VaccineService implements IVaccineService {

	private IFileReadingService frs;
    private String fileName;

	public VaccineService(IFileReadingService frs, String fileName) {
		this.frs = frs;
        this.fileName = fileName;
	}

	public List<Vaccine> listAllVaccines() {
        List<Vaccine> result = new ArrayList<>();
        String line = "";
		String splitBy = ",";
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/project/src/main/resources/vaccinedata.csv"));
			line = br.readLine();
			while ((line = br.readLine()) != null) {
                String[] vaccineData = line.split(splitBy);
                Vaccine temp = new Vaccine();
                temp.setVaccine_name(vaccineData[0]);
                result.add(temp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
        Vaccine result = new Vaccine();
        result.setVaccine_name(vaccine_name);
		return result;
	}

}
