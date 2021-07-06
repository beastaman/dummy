package com.controller;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.StudentDAO;
import com.entity.Student;

@Controller
public class MainController {

	@RequestMapping("/hello")
	public String getNextPage() {
		return "NewFile";
	}

	@GetMapping("/getstudent")
	public String getAllUser(Model model) {
		StudentDAO dao;
		try {
			
			dao = new StudentDAO();
			List<Student> students =  dao.getAllStudent();
			//students.forEach(System.out::println);
			
			model.addAttribute("students",students);
			
			return "student";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@GetMapping("/signup")
	public String goToSignup() {
		return "signup";
	}

}