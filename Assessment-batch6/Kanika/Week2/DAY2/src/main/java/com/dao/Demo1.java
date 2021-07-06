package com.dao;

import java.util.*;

import com.to.*;

public class Demo1 {

	public static void main(String[] args) {

		try {

			StudentDAO studentDAO = new StudentDAO();
			
			//update
			
			List<Custum> custums = studentDAO.joinStudent();
			
			custums.forEach(System.out::println);
		

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
