package com.asde.file;

import java.util.List;

import com.asde.dbconnect.entities.Vaccine;
import com.asde.dbconnect.entities.VaccineSlot;


public interface IFileReadingService {
	
	/**
	 * Return the list of vaccine cetres as read from the csv file provided as the method parameter
	 * @param filename
	 * @return
	 */
	public List<VaccineSlot> readVaccinCentreData(String filename) throws Exception;

	/**
	 * Get the total no of slots for a location as per the vaccinetype
	 * @param location
	 * @return
	 */
    public Integer getTotalSlotsForLocation(String filename, String location, String vaccineType) throws Exception;
    
    public List<Vaccine> getVaccineData(String filename) throws Exception;
}
