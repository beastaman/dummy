package com.dayfour;

import java.util.*;
public class DemoAdvMap {
	public static void main(String[] args) {
		Map<String, EmployeeTO > map = new HashMap<>();
		map.put("Yogendra", new EmployeeTO(23,"Yogendra","Singh",54000) );
		map.put("User1", new EmployeeTO(22,"User1","sname1",52000) );
		map.put("User2", new EmployeeTO(21,"User2","sname2",51000) );
		map.put("User3", new EmployeeTO(24,"User3","sname3",50000) );
		map.put("User4", new EmployeeTO(34,"User4","sname4",55000) );
		
		System.out.println("Enter name : ");
		try {
			String s = Read.scanner.next();
			System.out.println(map.get(s));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Employee does not exist !!! ");
		}
	}
}
