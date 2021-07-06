package com.asde.file;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;  
import java.util.List;
import java.nio.file.Path;
import com.asde.dbconnect.entities.VaccineSlot;
import java.nio.file.*;
import java.io.*;
import java.util.ArrayList;

public class FileReadingServiceImpl implements IFileReadingService {


	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType) {
		return null;
	}

	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) {
	  List<VaccineSlot> vaccineslots = new ArrayList<VaccineSlot>();
        Path pathToFile = Paths.get(filename);
        File f=pathToFile.toFile();
        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try{

            // read the first line from the text file
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                VaccineSlot vs=new VaccineSlot();
                vs.setIs_available(Boolean.parseBoolean(attributes[2]));
                vs.setLocation_name((attributes[1]));
                vs.setSlot_id(Integer.parseInt(attributes[3]));
                vs.setVaccine_id(attributes[0]);
                
                vaccineslots.add(vs);
                
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return vaccineslots;
	}

}
