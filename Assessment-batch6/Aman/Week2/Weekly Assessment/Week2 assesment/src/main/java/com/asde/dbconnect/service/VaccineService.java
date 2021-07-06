package com.asde.dbconnect.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        String qry ="select distinct vaccinename from  vaccinedata ;";
        List<Vaccine> lists = new ArrayList<>();
		try{
        Connection connection = Connectivity.getConnection();
        PreparedStatement preparedStatement =connection.prepareStatement(qry);
        ResultSet rs = preparedStatement.executeQuery();
        while(rs.next()) lists.add(new Vaccine(rs.getString(1)));
        return lists;
        }
        catch(Exception e){
            e.getMessage();
        }
        return lists;
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
		String query ="select * vaccinename from vaccinedata where vaccinename=?;";
        Vaccine vaccine= new Vaccine();
        try{
        Connection connection = Connectivity.getConnection();
        PreparedStatement preparedStatement =connection.prepareStatement(query);
        preparedStatement.setString(1, vaccine_name);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {vaccine = new Vaccine(resultSet.getString(1));}
        }
        catch(Exception e){
            e.getMessage();
        }
        return vaccine;
	}

}
