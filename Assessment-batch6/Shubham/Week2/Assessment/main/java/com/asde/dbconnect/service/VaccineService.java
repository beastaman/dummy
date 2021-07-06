package com.asde.dbconnect.service;

import java.io.BufferedReader;
import java.io.FileReader;   
import java.nio.file.*;
import java.util.List;
import java.util.*;
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
		List<Vaccine> vaccines = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        File f=pathToFile.toFile();
        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = new BufferedReader(new FileReader(f)) )
        {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                Vaccine v=new Vaccine();
                v.setVaccine_name(attributes[0]);
                vaccines.add(v);
                
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return vaccines;
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
        // TODO Auto-generated method stub
        List<Vaccine> a=listAllVaccines();
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i).getVaccine_name().equalsIgnoreCase(vaccine_name))
                return a.get(i);
        }
		return null;
	}

}
