package com.asde.dbconnect.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.dao.Connectivity;
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
    public List<VaccineSlot> getAllAvailableSlots() throws Exception{
        List<VaccineSlot> list = new ArrayList<>();

        Connection connection = Connectivity.getConnection();
		
		String query = "SELECT * FROM vaccination";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		ResultSet resultSet = preparedStudent.executeQuery();
        
        try {
		// point will be at BOF, if we give next() then only it will move to the next record
		while(resultSet.next()) {
			list.add(new VaccineSlot(resultSet.getInt(4), resultSet.getString(2), 
					resultSet.getString(1),resultSet.getBoolean(3)));
        }
        
        } catch (Exception e) {
            throw new Exception();
        }
		
		return list;
    }

    /**
     * Get the no of slots from the database for a specific vaccine and location
     * 
     * For example: gurgaon and covaxin
     */
    @Override
    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) throws Exception{
        // TODO Auto-generated method stub

        Connection connection = Connectivity.getConnection();
		
		String query = "SELECT * FROM vaccination where location = ? and vaccinetype = ?";
        PreparedStatement preparedStudent = connection.prepareStatement(query);
        
        preparedStudent.setString(1, location);
        preparedStudent.setString(2, vaccine_name);

		ResultSet resultSet = preparedStudent.executeQuery();
		
		// point will be at BOF, if we give next() then only it will move to the next record
        
        int slots_available = 0;
        if(resultSet.next()) {
            slots_available = resultSet.getInt(4);
        } else {
            throw new Exception();
        }

        return slots_available;
    }

    /**
     * Get the list of all slots that are available for a particular location
     * 
     * For example: gurgaon
     */
    @Override
    public List<VaccineSlot> getVaccineSlotsForLocation(String location) throws Exception{

    	List<VaccineSlot> list = new ArrayList<>();

        Connection connection = Connectivity.getConnection();
		
		String query = "SELECT * FROM vaccination where location = ?";
		PreparedStatement preparedStudent = connection.prepareStatement(query);
		ResultSet resultSet = preparedStudent.executeQuery();
        
        try {
		// point will be at BOF, if we give next() then only it will move to the next record
		while(resultSet.next()) {
			list.add(new VaccineSlot(resultSet.getInt(4), resultSet.getString(2), 
					resultSet.getString(1),resultSet.getBoolean(3)));
        }
        
        } catch (Exception e) {
            throw new Exception();
        }
		
		return list;
    }
    
}
