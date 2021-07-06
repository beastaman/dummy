package com.asde.dbconnect.service;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        List<Vaccine>  vaccines= new ArrayList<>();
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.fileName));
            String s;
            while((s= bufferedReader.readLine())!=null )
            {
                String[] col = s.split(",");
                Vaccine vaccine = new Vaccine();
                vaccine.setVaccine_name(col[0]);
                //System.out.println( slot.getLocation_name() + " " + slot.isIs_available() );
                vaccines.add(vaccine);
            }
            bufferedReader.close();
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
        return vaccines;
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
        Vaccine vaccine = new Vaccine();
        vaccine.setVaccine_name(vaccine_name);
        return vaccine;
	}

}
