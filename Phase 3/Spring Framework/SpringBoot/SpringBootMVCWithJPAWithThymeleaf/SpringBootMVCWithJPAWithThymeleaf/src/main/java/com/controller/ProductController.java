package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	// http://localhost:9191/
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openFirstPage() {
		
		// coding 
		System.out.println("I Came Here");
		return "index";		// view resolver responsible to check the page inside folder. 
		//return "welcome";
	}
	
	// http://localhost:9191/add
	
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public String addProductPage(Product product,Model model) {	// di for product and model 
		// coding
		model.addAttribute("pp", product);		// product object stored in model scope.
		return "addProduct";			//open addProduct.html page 
	}
	
	@RequestMapping(value = "addProduct",method = RequestMethod.POST)
	public String addProductUsingHttpServlet(HttpServletRequest req, Product product,Model model) { //DI
		
		int id = Integer.parseInt(req.getParameter("id"));
		String pname= req.getParameter("pname");
		float price = Float.parseFloat(req.getParameter("price"));
		
		product.setId(id);
		product.setPname(pname);
		product.setPrice(price);
		
		String result = productService.storeProduct(product);
			model.addAttribute("msg", result);			// req.setAttribute("msg",result);
			model.addAttribute("pp", product);
		System.out.println(result);
		
		return "addProduct";
	}
	
	
	@RequestMapping(value = "addProductInDb",method = RequestMethod.POST)
	public String addProductInDbUsingThymeleafForm(Product product,Model model) { //DI
		
//		int id = Integer.parseInt(req.getParameter("id"));
//		String pname= req.getParameter("pname");
//		float price = Float.parseFloat(req.getParameter("price"));
//		
//		product.setId(id);
//		product.setPname(pname);
//		product.setPrice(price);
		
		String result = productService.storeProduct(product);
		model.addAttribute("pp", product);   // store product object in model scope 
			model.addAttribute("msg", result);			// req.setAttribute("msg",result);
		System.out.println(result);
		
		return "addProduct";
	}
	
	@RequestMapping(value = "viewProduct",method = RequestMethod.GET)
	public String viewProduct(Model model) {
		List<Product> listOfProducts = productService.findAllProducts();
		model.addAttribute("products", listOfProducts);
		return "viewProduct";			// it render to viewProduct.html 
	}
}