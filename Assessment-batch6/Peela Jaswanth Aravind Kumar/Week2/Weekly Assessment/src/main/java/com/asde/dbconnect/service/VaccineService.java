package com.asde.dbconnect.service;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
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
        List<Vaccine>res = new ArrayList<Vaccine>();
        String line = new String("");
        try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/vaccinedata.csv"));
			while((line = br.readLine()) != null) {
                String cols[] = line.split(",");
                
                // slots = Integer.parse(cols[3]);
                Vaccine vs = new Vaccine(cols[0],cols[1],Integer.parseInt(cols[2]));
                res.add(vs);
                
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        return res;
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
        List<Vaccine> vaccines = listAllVaccines();
        for(Vaccine v: vaccines){
            if(v.getVaccine_name() == vaccine_name){
                return v;
            }
        }
        return new Vaccine(null,null,0);
	}

    public IFileReadingService getFrs() {
        return frs;
    }

    public void setFrs(IFileReadingService frs) {
        this.frs = frs;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
