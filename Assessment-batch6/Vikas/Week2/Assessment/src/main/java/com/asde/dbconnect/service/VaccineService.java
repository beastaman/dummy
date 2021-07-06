package com.asde.dbconnect.service;

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
		return null;
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
		String str = this.fileName;
        String[] array1 = str.split("\\r?\\n");
        
        for(int i = 1; i < array1.length ; i++ ) {
            String[] array2 = array1[i].split(",");
            if(vaccine_name == array2[0]) {
                Vaccine vaccine = new Vaccine();
                vaccine.setVaccine_name(array2[0]);
                vaccine.setManufacturer(array2[1]);
                vaccine.setEfficiency(array2[2]);
                return vaccine;
            }
        }
		return null;
	}

}
