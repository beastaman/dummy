package com.asde.dbconnect.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
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
		String query ="Select distinct vaccinename from  vaccinedata ;";
        List<Vaccine> ls = new ArrayList<>();
        try{
        Connection connection = Connectivity.getConnection();

        PreparedStatement ps =connection.prepareStatement(query);
        //preparedStatment.setString(1, location);
        
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ls.add(new Vaccine(rs.getString(1)));
        }
        return ls;
        }
        catch(Exception e){
            e.getMessage();

        }
        return ls;
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
		String query ="select * vaccinename from vaccinedata where vaccinename=?;";
        Vaccine v=null;
        
        try{
        Connection connection = Connectivity.getConnection();

        PreparedStatement ps =connection.prepareStatement(query);
        ps.setString(1, vaccine_name);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            v = new Vaccine(rs.getString(1));
        }
        
        }
        catch(Exception e){
            e.getMessage();

        }
        return v;
	}

}
