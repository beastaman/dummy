package com.sapient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sapient.dao.StudentDao;
import com.sapient.to.Student;

@Controller
public class MainController {

	private StudentDao studentDao = new StudentDao();

	@RequestMapping("/")
	public String getIndex() {
		
		System.out.println("Check");
		return "index";
	}

	@RequestMapping("/add")
	public String getAdd() {
		
		return "add";
	}

	@GetMapping("/students")
	public String getStudents(Model model) throws Exception {
		
		List<Student> students = studentDao.getAllStudents();
		students.forEach(System.out::println);
		model.addAttribute("students", students);
		return "students";
	}

	@GetMapping("/students/{id}")
	public String getStudent(@PathVariable String id, Model model) throws Exception {
		
		Student student = studentDao.getStudentById(id);
		System.out.println(student);
		model.addAttribute("student", student);
		return "student";
	}

	@GetMapping("/addstudent")
	public String getAddStudent() throws Exception {
		
		return "addstudent";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) throws Exception {
		
		if(studentDao.saveStudent(student))
			return "redirect:/students";
		return "";
	}

	@PostMapping("/students/{id}")	// Post instead of Delete as HTML form does not support DELETE Method
	public String deleteStudent(@PathVariable String id) throws Exception {
		
		if(studentDao.deleteStudent(id))
			return "redirect:/students";
		return "";
	}
}
