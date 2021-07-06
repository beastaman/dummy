package com.asde.file;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.asde.dbconnect.entities.VaccineSlot;
import com.asde.dbconnect.utils.Connectivity;


public class FileReadingServiceImpl implements IFileReadingService {


	@Override
	public Integer getTotalSlotsForLocation(String location, String vaccineType) {
		Integer count=0;
        try 
        {
          Connection connection= Connectivity.getConnection();

        List<VaccineSlot> slots = new ArrayList<>();
        String sql= "SELECT count(*) from vaccinecentredata WHERE location==?";
        
        PreparedStatement ps= connection.prepareStatement(sql);
        ps.setString(1, location);
        ResultSet rs= ps.executeQuery();

        while(rs.next())
        {  
           
           count= rs.getInt(1);

        }
        }
        catch (Exception e)
        {
            e.getMessage();
        }

        return count;
       
	}

	@Override
	public List<VaccineSlot> readVaccinCentreData(String filename) {
        // TODO Auto-generated method stub
        
        List<VaccineSlot> vaccineSlots = new ArrayList<>();
        String query= "SELECT * from vaccinecentredata";
        

		return null;
	}

}