package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		
		//productDao.save(product);
		
		Optional<Product> result = productDao.findById(product.getId());
		if(result.isPresent()) {
			return "Product id must be unique";
		}else {
			productDao.save(product);
			return "Product information stored in database";
		}
	}
	
	public List<Product> findAllProducts() {
		return productDao.findAll();
	}
	
	public String deleteProduct(int pid) {
		
		//productDao.save(product);
		
		Optional<Product> result = productDao.findById(pid);
		if(result.isPresent()) {
			Product p = result.get();
		productDao.delete(p);
			return "Product deleted successfully";
		}else {
			
			return "product not present";
		}
	}
	
	public String updateProduct(Product product) {
		
		//productDao.save(product);
		
		Optional<Product> result = productDao.findById(product.getId());
		if(result.isPresent()) {
			Product p = result.get();		// p hold old record 
			p.setPrice(product.getPrice()); // update price	
		productDao.saveAndFlush(p);
			return "Product update successfully";
		}else {
			
			return "product not present";
		}
	}
}