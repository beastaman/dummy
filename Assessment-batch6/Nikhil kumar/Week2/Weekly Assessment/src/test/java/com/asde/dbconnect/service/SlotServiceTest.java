package com.asde.dbconnect.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.asde.file.FileReadingServiceImpl;

public class SlotServiceTest {

	@Test
	public void testGetAllAvailableSlots() {
		ISlotService slotService = new SlotService(new FileReadingServiceImpl(), "/Volumes/Backup/Downloads/project/src/main/resources/vaccinecentredata.csv");
		//It Should be 2 because available are two only
		assertTrue(slotService.getAllAvailableSlots().size() == 5);
	}

	@Test
	public void testGetVaccineSlotsForLocationAndVaccine() {
		ISlotService slotService = new SlotService(new FileReadingServiceImpl(), "/Volumes/Backup/Downloads/project/src/main/resources/vaccinecentredata.csv");
		//It should be gurugram
		assertTrue(slotService.getVaccineSlotsForLocationAndVaccine("gurgaon", "covaxin") == 50);
	}

	@Test
	public void testGetVaccineSlotsForLocation() {
		ISlotService slotService = new SlotService(new FileReadingServiceImpl(), "/Volumes/Backup/Downloads/project/src/main/resources/vaccinecentredata.csv");
		//it should be gurugram
		assertTrue(slotService.getVaccineSlotsForLocation("gurgaon").size() == 1);
	}

}
