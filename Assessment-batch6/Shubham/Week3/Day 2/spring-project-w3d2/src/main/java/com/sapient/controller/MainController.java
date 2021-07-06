package com.sapient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.Student;
import com.dao.StudentDao;

@Controller
public class MainController {

	@RequestMapping("/add")
	public String getString() {
		System.out.println("I am here");
		return "Hello";
	}
	@GetMapping("/getstudent")
	public String getAllUser(Model model) {
		StudentDao dao;
		try {
			
			dao = new StudentDao();
			List<Student> students =  dao.getAllStudent();
//			students.forEach(System.out::println);
			
			model.addAttribute("students",students);
			
			return "student";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
