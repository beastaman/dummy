package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.ProductDAO;
import com.dao.StudentDAO;
import com.to.Product;
import com.to.Student;

@Controller
public class MainController {

	@RequestMapping("/hello")
	public String getNextPage() {
		return "NewFile";
	}

	@RequestMapping("/getstudent")
	public String getAllUser(Model model) {
		StudentDAO dao;
		try {
			
			dao = new StudentDAO();
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
	
	@RequestMapping("/sample")
	public String getPage() {
		return "sample";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    ProductDAO dao=new ProductDAO();
	    try {
	    	dao.insertProduct(product);
	    }
	    catch (Exception e) {
			// TODO: handle exception
		}
	    
	    return "success";
	}

}