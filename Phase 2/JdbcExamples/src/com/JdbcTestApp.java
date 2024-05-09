package com;
import java.sql.*;

public class JdbcTestApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_training_database","root", "admin");
			System.out.println("Connected successfully");
			
		} catch (Exception e) {
			System.err.println(e.toString());
		}

	}

}
