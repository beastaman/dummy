package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.StudentDao;
import com.dao.productDao;
import com.to.Product;
import com.to.Student;

@Controller
public class MainController {
	@RequestMapping("/hello")
	public String getString() {
		return "hello";
	}
	
	@RequestMapping("/addproduct")
	public String getAddProductPage() {
		return "addProduct";
	}
	
	@RequestMapping("/delete")
	public String getDeletePage() {
		return "deleteProduct";
	}
	
	@GetMapping("/getstudent")
	public String getAlluser(Model model) {
		StudentDao dao = new StudentDao();
		
		try {
			List<Student> students = dao.getAllStudent();
			model.addAttribute("users",students);
			return "student";
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    productDao dao = new productDao();
	    
	    try {
	    	System.out.println("boom");
	    	dao.insertProduct(product);
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    	return "error";
	    }
	    return "success";
	}
	
	@RequestMapping(value = "/del", method = RequestMethod.POST)
	public String deleteProduct(@ModelAttribute("product") Product product) {
	    productDao dao = new productDao();
	  
	    try {
	    	dao.deleteProduct(product.getName());
	    	System.out.println("pj" + product.getName());
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    	return "error";
	    }
	    return "success";
	}
}
