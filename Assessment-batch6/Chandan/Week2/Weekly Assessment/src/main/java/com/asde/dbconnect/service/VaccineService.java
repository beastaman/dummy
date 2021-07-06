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
        try{
            List<Vaccine> vaccines = this.frs.getVaccineData(fileName);
            return vaccines;
        }
        catch(Exception e){
            return null;
        }
	}

	public Vaccine getVaccineDetails(String vaccine_name) {
        try{
            List<Vaccine> vaccines = this.frs.getVaccineData(fileName);
            

            for (Vaccine vaccine: vaccines){
                if(vaccine.getVaccine_name().equals(vaccine_name)){
                    return vaccine;
                }
            }
            
            throw new Exception("Not Found");
        }
        catch(Exception e){
            return null;
        }
        
	}

}
