package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
}
	
	public String storeProduct(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			return "Product ID must be unique";
		} else {
			productRepository.save(product);
			return "Product stored successfully";
		}
	}
	
	public String updateProductPrice(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			Product p = result.get();
			p.setPrice(product.getPrice());
			productRepository.saveAndFlush(p); // update
			return "Product price updated successfully";
		} else {
			
			return "Product not present";
		}
	}
	
	public String updateProductQty(Product product) {
		Optional<Product> result = productRepository.findById(product.getPid());
		if(result.isPresent()) {
			Product p = result.get();
			p.setQty(product.getQty());
			productRepository.saveAndFlush(p); // update
			return "Product quantity updated successfully";
		} else {
			
			return "Product not present";
		}
	}
	
	public String deleteProductById(int pid) {
		Optional<Product> result = productRepository.findById(pid);
		if(result.isPresent()) {
			productRepository.deleteById(pid);
			return "Product deleted successfully";
		} else {
			return "Product not present";
		}
	}
	
	public String searchProductById(int pid) {
		Optional<Product> result = productRepository.findById(pid);
		if(result.isPresent()) {
			Product p = result.get();
			return p.toString(); // 
		} else {
			return "Product not present"; // return object in string format make sure toString method overrided 
		}
	}
	
	
}
