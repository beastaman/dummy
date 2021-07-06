package com.asde.dbconnect.service;

import java.util.List;
import java.util.stream.Collector;
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
		return frs.getAllVaccines(fileName);
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
        List<Vaccine> vaccines = listAllVaccines();
        if(vaccines == null)
            return null;
        vaccines = vaccines.stream().map((vaccine) -> {
            if(vaccine.getVaccine_name().equalsIgnoreCase(vaccine_name))
                return vaccine;
            return null;
        })
        .filter((vaccine) -> (vaccine != null))
        .collect(Collectors.toList());
        
        if(vaccines.size() > 0)
            return vaccines.get(0);
		return null;
	}

}
