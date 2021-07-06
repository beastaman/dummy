package com.week1.day4.collections;

import java.util.*;

import com.week1.day4.utilities.Read;

public class DemoAdvMap {

	public static void main(String[] args) {

		Map<String, EmployeeTO> map = new HashMap<>();

		map.put("Wasim", new EmployeeTO("Wasim", "Name", 1000000, 22));
		map.put("Wasim1", new EmployeeTO("Wasim1", "Name", 1000000, 22));
		map.put("Wasim2", new EmployeeTO("Wasim2", "Name", 1000000, 22));
		map.put("Wasim3", new EmployeeTO("Wasim3", "Name", 1000000, 22));

		System.out.println("Enter name ");

		try {
			String s1 = Read.scanner.next();

			EmployeeTO employeeTO = map.get(s1);
			
			System.out.println(employeeTO);

		} catch (Exception e) {
			System.out.println("Employee doesn't exist");
		}

	}

}
