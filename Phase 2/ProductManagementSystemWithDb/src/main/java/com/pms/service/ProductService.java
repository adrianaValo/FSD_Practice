package com.pms.service;

import java.util.Iterator;
import java.util.List;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getPrice()<=1000) {
			return "Product price must be > 1000";
		}else if(pd.storeProduct(product)>0) {
			return "Product stored succesfully";
		}else {
			return "Product didnt' store";
		}
	}
	
	public String updateProduct(Product product) {
		if(pd.updateProduct(product)>0) {
			return "Product price updated successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public List<Product> findAllProduct() {
		List<Product> listOfProduct = pd.findAllProduct();
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			float discount = p.getPrice()*0.10f;
			p.setPrice(p.getPrice()-discount);
		}
		return listOfProduct;
	}
}