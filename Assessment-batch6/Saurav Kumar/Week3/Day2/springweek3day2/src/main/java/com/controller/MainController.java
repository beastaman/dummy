package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.ProductDao;
import com.dao.StudentDao;
import com.to.Product;
import com.to.Student;

@Controller
public class MainController {

	@RequestMapping("/hello")
	public String getString() {
		return "NewFile";
	}
	
	@RequestMapping("/getproduct")
	public String getForm() {
		return "saveproduct";
	}
	
	@RequestMapping("/deleteproduct")
	public String getProductToDelete() {
		return "delete";
	}
	
	@GetMapping("/getstudent")
	public String getAllStudent(Model model) {
		List<Student> students = null;
		try {
			students = new StudentDao().getAllStudent();	
			model.addAttribute("users", students);
			for(Student obj:students) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "students";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		try {
			new ProductDao().InsertData(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	     
	    return "NewFile";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deletProduct(@ModelAttribute("name") String name) {
		try {
			new ProductDao().deleteData(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	     
	    return "NewFile";
	}
}
