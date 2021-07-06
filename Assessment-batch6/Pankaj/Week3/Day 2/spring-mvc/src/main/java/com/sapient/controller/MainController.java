package com.sapient.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sapient.dao.BranchDAO;
import com.sapient.dao.ProductDAO;
import com.sapient.entity.Branch;
import com.sapient.entity.Product;

@Controller
public class MainController {

	@RequestMapping(value = "/add")
	public String getString() {
		return "add";
	}

	@RequestMapping(value = "/sample")
	public String getString1() {
		return "sample";
	}
	
	@RequestMapping(value = "/delete")
	public String getString2() {
		return "delete";
	}


	@GetMapping("/getbranches")
	public String getAllBranches(Model model) {
		BranchDAO dao;

		dao = new BranchDAO();
		try {
			List<Branch> branches = dao.getAllBranches();
			model.addAttribute("branches", branches);
			branches.forEach(System.out::println);
			return "branch";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		System.out.println(product);
		System.out.println("main controller line 49");
		ProductDAO dao = new ProductDAO();
		try {
			dao.insertProduct(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		return "success";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String deleteProduct(@ModelAttribute("product") Product product) {
		ProductDAO dao = new ProductDAO();
		try {
			System.out.println(product);
			dao.deleteProduct(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		return "success";
	}
}
