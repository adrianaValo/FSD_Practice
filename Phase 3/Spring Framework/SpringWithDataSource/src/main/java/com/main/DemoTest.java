package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	
	ProductService ps = (ProductService)ac.getBean("productService");
	
//	List<Product> listOfProduct = ps.findAllProduct();
//	System.out.println("all products");
//	for(Product p : listOfProduct) {
//		System.out.println(p);
//	}
	Product p1 = (Product)ac.getBean("product");
	
	Product p2 = (Product)ac.getBean("product");
	
	p1.setPid(104);
	p1.setPname("Pen Drive");
	p1.setPrice(1600);
	
	p2.setPid(105);
	p2.setPname("Mobile");
	p2.setPrice(45000);
	
	//System.out.println(p1);
	//System.out.println(p2);
	String result1 = ps.storeProduct(p1);
	String result2 = ps.storeProduct(p2);
	System.out.println(result1);
	System.out.println(result2);
	}

}