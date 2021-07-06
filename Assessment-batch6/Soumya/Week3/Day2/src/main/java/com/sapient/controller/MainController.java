package com.sapient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapient.dao.StudentDAO;
import com.sapient.to.Student;

@Controller
public class MainController {

//	@RequestMapping("/add")
//	public String getString() {
//		return "index";
//	}

	@RequestMapping("/hello")
	public String redirect() {
		return "viewpage";
	}

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String signup() {
		return "signup";
	}

	@RequestMapping("/delete")
	public String getDeletePage() {
		return "delete";
	}

	@RequestMapping("/helloagain")
	public String display(Model model) {
		StudentDAO dao;
		try {

			dao = new StudentDAO();
			List<Student> students = dao.getAllStudent();
//			students.forEach(System.out::println);

			model.addAttribute("students", students);

			return "final";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		// return "final";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student student) {
		StudentDAO dao = new StudentDAO();
		// Student temp = (Student) model.get
		System.out.println(student);
		try {
			dao.insertStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "viewpage";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteProduct(@ModelAttribute("product") Student student) {
		System.out.println("Product delete: " + student);
		StudentDAO dao;
		try {
			dao = new StudentDAO();
			dao.deleteStudent(student);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return "viewpage";
	}

}
