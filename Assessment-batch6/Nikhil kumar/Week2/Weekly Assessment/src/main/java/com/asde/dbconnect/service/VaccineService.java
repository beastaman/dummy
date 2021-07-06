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
        String line="";
        boolean seen=true;
        try{
            BufferedReader br = new BufferedReader(new FileReader("/Users/nikhil/Documents/project/src/main/resources/vaccinedata.csv"));
            while((line=br.readLine())!=null){
                String[] data = line.split(",");
                if(seen){
                    seen=false;
                    continue;
                }
                Vaccine vaccine = new Vaccine();
                vaccine.setVaccine_name(data[0]);
                result.add(vaccine);
            }
            // br.close();
        }catch(IOException e){

        }

        return result;
    }

    @Override
    public Vaccine getVaccineDetails(String vaccine_name) {
        Vaccine vaccine = new Vaccine();
        vaccine.setVaccine_name(vaccine_name);
        return vaccine;
    }

}
