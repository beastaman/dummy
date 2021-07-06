package com.asde.dbconnect.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		// TODO Auto-generated method stub
		File myFile = new File(fileName);
		List<Vaccine> list = new ArrayList<>();

		try {
			Scanner scn = new Scanner(myFile);
			while (scn.hasNextLine()) {
				String line = scn.nextLine();
				String[] arr = line.split(",");
				if (arr[0].equals("vaccinename") == false) {
					Vaccine vaccine = new Vaccine();
					vaccine.setVaccine_name(arr[0]);
					list.add(vaccine);
				}
			}
			scn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Vaccine getVaccineDetails(String vaccine_name) {
		// TODO Auto-generated method stub
		Vaccine vaccine = null;
		File myFile = new File(fileName);
		try {
			Scanner scn = new Scanner(myFile);
			while (scn.hasNextLine()) {
				String line = scn.nextLine();
				String[] arr = line.split(",");
				if (arr[0].equals(vaccine_name) == true) {
					vaccine = new Vaccine();
					vaccine.setVaccine_name(arr[0]);
				}
			}
			scn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return vaccine;
	}

}
