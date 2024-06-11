package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository			// this dao layer specific annotation 
public class ProductDao {

	@Autowired
	DataSource ds;		// before spring framework we were searching database connection using jndi lookup 
						// in spring this information present in beans.xml file with less configuration 
	
	public int storeProduct(Product product) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1, product.getPid());
			pstmt.setString(2, product.getPname());
			pstmt.setFloat(3, product.getPrice());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Product> findAllProducts() {
		List<Product> listOfProduct = new ArrayList<Product>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setPid(rs.getInt(1));
				product.setPname(rs.getString(2));
				product.setPrice(rs.getFloat(3));
				listOfProduct.add(product);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return listOfProduct;
	}
}