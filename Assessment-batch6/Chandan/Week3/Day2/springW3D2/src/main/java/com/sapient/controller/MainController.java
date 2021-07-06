package com.sapient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapient.dao.StudentDao;
import com.to.Product;
import com.to.Student;

@Controller
public class MainController {
	
	
	@RequestMapping("/hello")
	public String getString() {

		return "Hello";
	}
	
	@GetMapping("/getStudent")
	public String getAllStudents(Model model) {
		
		StudentDao studentDao = new StudentDao();
		
		try {
			List<Student> students = studentDao.getAllStudent();
			model.addAttribute("students", students);
			
			students.forEach(System.out::println);
			
			return "Student";
		}
		catch (Exception e){
			return "Hello";
		}
		
	}
	
	@GetMapping("/input")
	public String getInputForm() {
		
		return "Input";
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    
		System.out.println(product);
		 
	    return "Success";
	}
	
	
	@GetMapping("/delete")
	public String getDeleteForm() {
		
		return "Delete";
	}
	
	@RequestMapping(value = "/deleteProd", method = RequestMethod.POST)
	public String deleteProduct(@ModelAttribute("product") Product product) {
	    
		System.out.println("Product delete: " + product);
		
	    return "Success";
	}
	

}
