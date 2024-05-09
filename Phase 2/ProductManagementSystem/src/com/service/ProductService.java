package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;


public class ProductService {
	List<Product> listOfProduct = new ArrayList<Product>();
	// don't take value through keyboard from service class as well as service class not responsible
	// display the output class
	
	public String addProduct(Product product) {
		int flag = 0;
		if(listOfProduct.size() == 0) {
			listOfProduct.add(product);
		return "Product added successfully";
	}
		
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid() == product.getPid()) {
				flag++;
			}
			break;
		}
		
		if(flag == 0) {
			listOfProduct.add(product);
			return "Product added successfully";
		} else {
			flag = 0;
			return "Product ID must be unique";
		}
	}
	
	public String deleteProduct(int pid) {
		int flag = 0;
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid() == pid) {
				li.remove();
				flag++;
			}
			break;
		}
		if(flag == 0) {
			return "Product not present";
		} else {
			flag = 0;
			return "Product deleted successfully";
		}
	}
	
	public String updateProductprice(Product product) {
		int flag = 0;
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid() == product.getPid()) {
				p.setPrice(product.getPrice()); // update new price once we find the product by pid
				flag++;
			}
			break;
		}
		if(flag == 0) {
			return "Product not present";
		} else {
			flag = 0;
			return "Product updated successfully";
		}
	}
	
	
	
	public List<Product> findAllproducts() {
		return listOfProduct;
	}
	
	
}
