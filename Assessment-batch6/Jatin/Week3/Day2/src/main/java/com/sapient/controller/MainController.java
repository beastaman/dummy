package com.sapient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.StudentDAO;
import com.entity.Product;
import com.entity.Student;

@Controller
public class MainController {

	@RequestMapping("/add")
	public String getString() {
		return "NewFile";
	}

	@RequestMapping("/addbrand")
	public String getaddstudent() {
		return "addstudent";
	}

	@GetMapping("/student")
	@ModelAttribute
	public String students(Model model) {
		StudentDAO dao = null;
		try {
			dao = new StudentDAO();
			List<Student> allStudents = dao.getAllStudent();
			model.addAttribute("users", allStudents);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) throws Exception {
		System.out.print(product);
		try {
			StudentDAO dao = new StudentDAO();
			dao.saveItem(product);
			return "<h1>Student added</h1>";
		} catch (Exception e) {
			return "<h1>Error</h1>";
		}
	}

}
