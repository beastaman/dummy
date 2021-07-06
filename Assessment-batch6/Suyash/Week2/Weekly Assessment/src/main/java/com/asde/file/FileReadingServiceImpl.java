package com.asde.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.Vaccine;
import com.asde.dbconnect.entities.VaccineSlot;

public class FileReadingServiceImpl implements IFileReadingService {


	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType) {
		return null;
	}

	@Override
    public List<VaccineSlot> readVaccinCentreData(String filename) 
    {
        // TODO Auto-generated method stub
        List<VaccineSlot> vaccineslots=new ArrayList<VaccineSlot>();
        String line=new String("");
        boolean x;
        try{
            BufferedReader br=new BufferedReader(new FileReader(filename));
            while((line=br.readLine())!=null){
                String cols[]=line.split(",");
                if (cols[2]=="true")
                    x=true;
                else
                    x=false;
                VaccineSlot vs=new VaccineSlot(cols[0],cols[1],x,Integer.parseInt(cols[3]));
                vaccineslots.add(vs);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
		return vaccineslots;
	
    }

     public List<Vaccine> readVaccine(String filename) 
    {
        // TODO Auto-generated method stub
        List<Vaccine> vaccines=new ArrayList<Vaccine>();
        String line=new String("");
        try{
            BufferedReader br=new BufferedReader(new FileReader(filename));
            while((line=br.readLine())!=null){
                String cols[]=line.split(",");
                Vaccine vs=new Vaccine(cols[0],cols[1],cols[2]);
                vaccines.add(vs);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
		return vaccines;
	
    }
}
