package com.asde.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {


    @Override
    public Integer getTotalSlotsForLocation(String location, String vaccineType) {
        String line="";
        Integer ans=0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("/Users/nikhil/Documents/project/src/main/resources/vaccinecentredata.csv"));
            while((line=br.readLine())!=null){
                String[] data = line.split(",");
                System.out.println(data[1]+" "+data[0]);
                if(location.equals(data[1]) && vaccineType.equals(data[0])){
                     return Integer.parseInt(data[3]);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return ans;
    }

    @Override
    public List<VaccineSlot> readVaccinCentreData(String filename) {
        String line="";
        List<VaccineSlot> fetchedData = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("/Users/nikhil/Documents/project/src/main/resources/vaccinecentredata.csv"));
            while((line=br.readLine())!=null){
                String[] data = line.split(",");
                VaccineSlot curr = new VaccineSlot();
                curr.setIs_available(Boolean.parseBoolean(data[2]));
                curr.setLocation_name(data[1]);
                curr.setVaccine_id(data[0]);
                curr.setSlot_id(Integer.parseInt(data[3]));
                fetchedData.add(curr);
            }
        }catch(IOException e){
            System.out.print(e.getLocalizedMessage());
        }
        return fetchedData;
    }

    @Override
    public List<VaccineSlot> readVaccinAvailableCentreData(String filename) {
        String line="";
        List<VaccineSlot> fetchedData = new ArrayList<>();
        boolean seen=true;
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while((line=br.readLine())!=null){
                if(seen){
                    seen=false;
                    continue;
                }
                String[] data = line.split(",");
                if(data[2].equals("true")){
                    VaccineSlot curr = new VaccineSlot();
                    curr.setIs_available(true);
                    curr.setLocation_name(data[1]);
                    curr.setVaccine_id(data[0]);
                    curr.setSlot_id(Integer.parseInt(data[3]));
                    fetchedData.add(curr);
                }
            }
        }catch(IOException e){
            System.out.print(e.getLocalizedMessage());
        }
        return fetchedData;
    }

    public Integer getTotalSlotsAvailableForLocation(String location, String vaccineType) {
        String fileName = "/Volumes/Backup/Downloads/project/src/main/resources/vaccinecentredata.csv";
        String line="";
        Integer ans=0;
        boolean checkFirstRow=false;
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while((line=br.readLine())!=null){
                if(checkFirstRow){
                    String[] data = line.split(",");
                    if(location.equals(data[1]) && vaccineType.equals(data[0]) && data[2].equals("true")){
                        ans+= Integer.parseInt(data[3]);
                    }
                }else{
                    checkFirstRow=true;
                }
            }
        }catch(IOException e){

        }
        return ans;
    }
}
