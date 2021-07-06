package com.day4;

import java.util.HashMap;
import java.util.Map;

import com.sapient.read;

public class DemoMap {

	public static void main(String[] args) {

		Map<String, EmployeeTO> map = new HashMap();

		map.put("Soumya", new EmployeeTO(22, "Soumya", "Dandapat", 1000));
		map.put("Soumya2", new EmployeeTO(23, "Soumya", "Dandapat", 1000));
		map.put("Soumya3", new EmployeeTO(24, "Soumya", "Dandapat", 1000));

		System.out.println("Enter Name");

		try {
			String s1 = read.scanner.next();
			System.out.println(map.get(s1));
		} catch (Exception e) {
			System.out.println("Employee not exist");
		}
	}

}
