package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository			// this dao layer specific annotation 
public class ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int storeProduct(Product product) {
		try {
	return jdbcTemplate.update("insert into product values(?,?,?)", product.getPid(),product.getPname(),product.getPrice());
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	
	public int updateProduct(Product product) {
		try {
	return jdbcTemplate.update("update product set price = ? where pid=?",product.getPrice(),product.getPid());
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int deleteProduct(int pid) {
		try {
	return jdbcTemplate.update("delete from product where pid=?",pid);
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Map<String, Object>> findAllProductByMap() {
		try {
			return jdbcTemplate.queryForList("select * from product");
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}
	
	public List<Product> findAllProductByProduct() {
		try {
		return jdbcTemplate.query("select * from product", new MyRowMapper());
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}
	public  List<Product> findAllProductByProductByPrice(float price) {
		try {
		return jdbcTemplate.query("select * from product where price >?",new MyRowMapper(),price);
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}
}

class MyRowMapper implements RowMapper<Product>{
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {	// this method responsible to convert each record to object
		Product p = new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setPrice(rs.getFloat(3));
		return p;
	}
}