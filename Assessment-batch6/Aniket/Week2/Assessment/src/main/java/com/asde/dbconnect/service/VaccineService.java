package com.asde.dbconnect.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Vaccine> vaccines = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // vaccinename,manufacturer,efficacy
                String[] row = line.split(",");
                
                Vaccine curVaccine = new Vaccine();
                curVaccine.setVaccine_name(row[0]);
                vaccines.add(curVaccine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return vaccines;
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
        List<Vaccine> vaccines = listAllVaccines();
        var result = vaccines.stream().filter(s -> s.getVaccine_name().equals(vaccine_name)).collect(Collectors.toList());
        return result.get(0);
	}

}
