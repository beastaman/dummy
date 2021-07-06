package com.asde.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.asde.dbconnect.entities.Vaccine;
import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {

    @Override
    public Integer getTotalSlotsForLocation(String filename, String location, String vaccineType) {

        try {
            FileReader fileReader = new FileReader(new File(filename));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Integer totalSlots = bufferedReader.lines().skip(1).map((row) -> {
                String[] tokens = row.split(",");
                return tokens;
            })
            .filter((tokens) -> (tokens[0].equalsIgnoreCase(vaccineType) && tokens[1].equalsIgnoreCase(location) && tokens[2].equalsIgnoreCase("true")))
            .mapToInt((tokens) -> Integer.parseInt(tokens[3])).sum();

            return totalSlots;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
		return null;
    }

    @Override
    public List<VaccineSlot> readVaccinCentreData(String filename) {

        try {
            FileReader fileReader = new FileReader(new File(filename));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<VaccineSlot> vaccineSlots = bufferedReader.lines().skip(1).map((row) -> {
                String[] tokens = row.split(",");
                VaccineSlot vaccineSlot =  new VaccineSlot();
                vaccineSlot.setVaccine_id(tokens[0]);
                vaccineSlot.setLocation_name(tokens[1]);
                vaccineSlot.setIs_available(tokens[2].equalsIgnoreCase("true"));
                return vaccineSlot;
            })
            .collect(Collectors.toList());

            int id = 0;
            for(VaccineSlot vaccineSlot : vaccineSlots)
                vaccineSlot.setSlot_id(++id);

            return vaccineSlots;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
		return null;
	}

    public List<Vaccine> getAllVaccines(String filename) {

        try {
            FileReader fileReader = new FileReader(new File(filename));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<Vaccine> vaccines = bufferedReader.lines().skip(1).map((row) -> {
                String[] tokens = row.split(",");
                Vaccine vaccine =  new Vaccine();
                vaccine.setVaccine_name(tokens[0]);
                return vaccine;
            })
            .collect(Collectors.toList());

            return vaccines;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
		return null;
    }
}
