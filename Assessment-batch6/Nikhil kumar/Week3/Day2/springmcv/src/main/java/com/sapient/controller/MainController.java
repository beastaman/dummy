package com.sapient.controller;

import com.sapient.dao.ProductDao;
import com.sapient.dao.StudentDao;
import com.sapient.entity.Product;
import com.sapient.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getString(){
        return "hello";
    }

    @RequestMapping("/getstudents")
    public String findAll(Model model){
        try {
            List<Student> students = StudentDao.findAll();
            students.forEach(System.out::println);
            model.addAttribute("students", students);
            return "student";
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }

    @RequestMapping(value = "/add-product", method = RequestMethod.POST)
    public String insertProduct(@ModelAttribute("product") Product product){
        System.out.println("InsertProduct Called");
        System.out.println(product);
        try {
            ProductDao.insert(product);
            return "product-view";
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return "index";
    }

    @RequestMapping("/show-product")
    public String showProducts(Model model){
        System.out.println("Show product called");
        try {
            List<Product> productList = ProductDao.findAll();
            productList.forEach(System.out::println);
            model.addAttribute("products", ProductDao.findAll());
            return "product-view";
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return "hello";
    }

    @RequestMapping(value = "/delete-product", method = RequestMethod.GET)
    public String deleteProduct(@RequestParam(name = "id") String pid){
        System.out.println("Delete product called");
        System.out.println(pid);
        try {
            ProductDao.deleteById(Integer.parseInt(pid));
            return "product-view";
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return "hello";
    }

    @RequestMapping("/insert-product")
    public String showInsert(){
        return "product-add";
    }
}
