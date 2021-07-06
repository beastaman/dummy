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
        
        String s = "";
        List<Vaccine> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while((s = br.readLine())!=null) {
                String arr[] = s.split(",");

                String vaccine_name = arr[0];
                String manufacturer = arr[1];
                int efficacy = Integer.parseInt(arr[2]);

                Vaccine vaccine = new Vaccine();
                vaccine.setVaccine_name(vaccine_name);
                vaccine.setManufacturer(manufacturer);
                vaccine.setEfficacy(efficacy);

                list.add(vaccine);

            } 
        } catch (IOException e) {

        }
        
		return list;
        
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
        
        VaccineService vs = new VaccineService(frs, fileName);
        List<Vaccine> list = vs.listAllVaccines();
        for(Vaccine vaccine : list) {
            if(vaccine_name.equals(vaccine.getVaccine_name())) {
                return vaccine;
            }
        }

        return null;
	}

}
