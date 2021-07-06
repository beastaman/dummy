package com.asde.dbconnect.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.VaccineSlot;
import com.asde.file.IFileReadingService;

public class SlotService implements ISlotService {

    private IFileReadingService frs;
    private String fileName;

    public SlotService(IFileReadingService frs, String fileName) {
        this.frs = frs;
        this.fileName = fileName;
    }

    /**
     * Get all available slots that are present in the file as a list of objects 
     * containing the location for each slot as well
     */
    @Override
    public List<VaccineSlot> getAllAvailableSlots() {
        List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        //slots.add(null);
        try{
        String query ="select * from  VaccineSlot where  is_available=true";
        Connection connection = Connectivity.getConnection();
        PreparedStatement preparedStatment =connection.prepareStatement(query);
        //preparedStatment.setString(1, location);
        ResultSet resultSet = preparedStatment.executeQuery();
        while(resultSet.next()){
            slots.add(new VaccineSlot(resultSet.getInt(1) , resultSet.getString(2),resultSet.getString(3),resultSet.getBoolean(4))); 
        }
        return slots;
        }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    }

    /**
     * Get the no of slots from the database for a specific vaccine and location
     * 
     * For example: gurgaon and covaxin
     */
    @Override
    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) {
        try{
        String qry ="select COUNT* from  VaccineSlot where location_name=? and vaccine_id=?;";
        Connection connection = Connectivity.getConnection();
        PreparedStatement preparedStatment =connection.prepareStatement(qry);
        preparedStatment.setString(1, location);
        preparedStatment.setString(2, vaccine_name);
        ResultSet resultSet = preparedStatment.executeQuery();
        if(resultSet.next()){
            return resultSet.getInt(1);
        }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    return 0;
    }

    /**
     * Get the list of all slots that are available for a particular location
     * 
     * For example: gurgaon
     */
    @Override
    public List<VaccineSlot> getVaccineSlotsForLocation(String location) {
    	List<VaccineSlot> slots = new ArrayList<VaccineSlot>();
        try{
        String qry ="select * from  VaccineSlot where location_name=? and is_available=true ;";
        Connection connection = Connectivity.getConnection();
        PreparedStatement preparedStatment =connection.prepareStatement(qry);
        preparedStatment.setString(1, location);
        ResultSet resultSet = preparedStatment.executeQuery();
        while(resultSet.next()){
            slots.add(new VaccineSlot(resultSet.getInt(1) , resultSet.getString(2),resultSet.getString(3),resultSet.getBoolean(4))); 
        }
        return slots;
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
        return slots;
    }
    
}
