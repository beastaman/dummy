package com.asde.dbconnect.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.asde.file.FileReadingServiceImpl;

public class VaccineServiceTest {

	@Test
	public void testListAllVaccines() {
		IVaccineService vaccineService = null;
		try {
			vaccineService = new VaccineService(new FileReadingServiceImpl(), "/Volumes/Backup/Downloads/project/src/main/resources/vaccinecentredata.csv");
		} catch (Exception e) {
			System.out.println("Error while getting DB connection");
		}
		//IT should be 2
		assertTrue(vaccineService.listAllVaccines().size() == 4);
	}

	@Test
	public void testGetVaccineDetails() {
		IVaccineService vaccineService = null;
		try {
			vaccineService = new VaccineService(new FileReadingServiceImpl(), "/Volumes/Backup/Downloads/project/src/main/resources/vaccinedata.csv");
		} catch (Exception e) {
			System.out.println("Error while getting DB connection");
		}
		assertTrue("covaxin".equals(vaccineService.getVaccineDetails("covaxin").getVaccine_name()));
	}

}
