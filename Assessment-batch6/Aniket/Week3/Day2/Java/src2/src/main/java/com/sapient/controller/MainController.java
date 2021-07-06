package com.sapient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapient.dao.ProductDAO;
import com.sapient.dao.StudentDAO;
import com.sapient.to.Product;
import com.sapient.to.Student;

@Controller
public class MainController {
	
	@RequestMapping("/hello")
	public String getString() {
		return "hello" ;
	}
	
	@GetMapping("/getstudent")
	public String getAllUsers(Model model)
	{
		StudentDAO studentDAO = new StudentDAO();
		try {
			List<Student> students = studentDAO.getAllStudent();
			students.forEach(System.out::println);
			model.addAttribute("users",students);
			return "student";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/save")
	public String insertproduct()
	{
		return "product";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	     ProductDAO productDAO = new ProductDAO();
	     try {
	    	 System.out.println(product);
			productDAO.insertProduct(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String deleteproduct()
	{
		return "delete";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE )
	public String deleteProduct(@ModelAttribute("product") Product product) {
	     ProductDAO productDAO = new ProductDAO();
	     try {
	    	 System.out.println(product);
			productDAO.deleteProduct(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    return "redirect:/";
	}
}
