package com.sapient.controller;
import com.sapient.entity.*;
import com.sapient.dao.*;
import java.util.*;
import org.springframework.ui.Model;  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/hello")
	public String getNextPage()
	{
		return "index";
	}
	
	@RequestMapping("/add")
	public String getString()
	{
		return "add";
	}
	@GetMapping("/getStudent")
	public String getAllUser(Model model)
	{
		StudentDAO dao;
		try
		{
			dao= new StudentDAO();
			List<Student> students= dao.getAllStudent();
			students.forEach(System.out::println);
			model.addAttribute("students",students);
			return "student";
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
 
