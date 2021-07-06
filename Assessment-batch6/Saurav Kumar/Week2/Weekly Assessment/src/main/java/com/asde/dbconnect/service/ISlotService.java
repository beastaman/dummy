package com.asde.dbconnect.service;

import java.util.List;
import com.asde.dbconnect.entities.VaccineSlot;

public interface ISlotService {

    public List<VaccineSlot> getAllAvailableSlots() throws Exception;

    public Integer getVaccineSlotsForLocationAndVaccine(String location, String vaccine_name) throws Exception;

    public List<VaccineSlot> getVaccineSlotsForLocation(String location) throws Exception;
}