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
        List<Vaccine> vaccines=frs.readVaccine(fileName);
        return vaccines;
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
        List<Vaccine> vaccines=frs.readVaccine(fileName);
        Vaccine vac=new Vaccine();
        for (Vaccine v:vaccines)
            if (v.getVaccinename()=vaccine_name)
                vac=v;
        return vac;
	}

}
