package com.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pms.bean.Product;

public class ProductDao {

	public int storeProduct(Product product) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_training_database", "root", "admin");
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
	
	public int updateProduct(Product product) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_training_database", "root", "admin");
	PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid=?");
	pstmt.setInt(2, product.getPid());
	
	pstmt.setFloat(1, product.getPrice());
	return pstmt.executeUpdate();
		} catch (Exception e) {
				System.err.println(e);
				return 0;
		}
	}
	
	public int deleteProduct(int pid) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_training_database", "root", "admin");
	PreparedStatement pstmt = con.prepareStatement("delete from product where pid = ?");
	pstmt.setInt(1, pid);
	
	return pstmt.executeUpdate();
		} catch (Exception e) {
				System.err.println(e);
				return 0;
		}
	}
	
	public List<Product> findAllProduct() {
		List<Product> listOfProduct = new ArrayList<Product>();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_training_database", "root", "admin");
		PreparedStatement pstmt = con.prepareStatement("select * from product");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getFloat(3));
			listOfProduct.add(p);
		}
			} catch (Exception e) {
					System.err.println(e);
			}
			return listOfProduct;
		}
	
	
}