package com.dao;

import java.util.*;

import com.to.Student;

public class demo1 {

	public static void main(String[] args) {
	
		
		try {
			
			StudentDao studentDao = new StudentDao();
			
			//studentDao.InsertData(new Student("s202", "John", "wick", "1972/01/22", "New york"));
			
			
			List<Student> list = studentDao.getAllStudent();
//			
//			for(int i=0; i<list.size(); i++) {
//				System.out.println(list.get(i));
//			}
//			
//			System.out.println();
//			System.out.println();
//			
//			Student student = studentDao.getAnyStudent("s102");
//			System.out.println(student);
//			
//			
//			studentDao.deleteData("s200");
//			System.out.println();
//			System.out.println("After deletion");
//			list = studentDao.getAllStudent();
//			for(int i=0; i<list.size(); i++) {
//				System.out.println(list.get(i));
//			}
			
//			studentDao.updateRecord("s102");
//			System.out.println();
//			System.out.println("After update");
//			list = studentDao.getAllStudent();
//			
//			for(int i=0; i<list.size(); i++) {
//				System.out.println(list.get(i));
//			}
			
			
			List<InnerJoinPOJO> list2 = studentDao.innerJoinQuery();
			for(InnerJoinPOJO obj:list2) {
				System.out.println(obj);
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
