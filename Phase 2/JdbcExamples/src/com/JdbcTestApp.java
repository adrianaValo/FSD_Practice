package com;
import java.sql.*;
import java.util.Scanner;

public class JdbcTestApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_training_database","root", "admin");
			System.out.println("Connected successfully");
			//Statement stmt = con.createStatement();
			
			
			// Insert Query
//			int result = stmt.executeUpdate("insert into product values(104,'Mobile',45000)");
//			if(result > 0) {
//				System.out.println("Record inserted successfully");
//			}
			
			// Delete Query
//			int result = stmt.executeUpdate("delete from product where pid = 100");
//			if(result > 0) {
//				System.out.println("Record deleted successfully");
//			} else {
//				System.out.println("Record not present");
//			}
			
			//Update Query
//			int result = stmt.executeUpdate("update product set price = 60000 where pid = 102");
//			if(result > 0) {
//				System.out.println("Record updated successfully");
//			} else {
//				System.out.println("Record not present");
//			}
//			
//			// Retrieve query
//			ResultSet rs = stmt.executeQuery("select * from product");
//			while(rs.next() ) {
//				System.out.println("pid is " + rs.getInt(1) + " pname is " + rs.getString(2) + " price is " + rs.getFloat(3));
//			}
//			
//			
			// stmt.close();
			
			Scanner sc = new Scanner(System.in);
			
			// insert query using PreparedStatement
//			PreparedStatement pstmt = con.prepareStatement("insert into product values (?,?,?)");
//			System.out.println("Enter the product ID");
//			int pid = sc.nextInt();
//				pstmt.setInt(1, pid);
//			System.out.println("Enter the product name");
//			String  pname = sc.next();
//				pstmt.setString(2, pname);
//				
//			System.out.println("Enter the price");
//			float price = sc.nextFloat();
//				pstmt.setFloat(3, price);
//			
//			int result = pstmt.executeUpdate();
//			if (result > 0) {
//				System.out.println("Record inserted successfully");
//			}
			
			
			// Delete query using PreparedStatement
			
			PreparedStatement pstmt = con.prepareStatement("delete from product where pid = ?");
			System.out.println("Enter the product ID");
			int pid = sc.nextInt();
				pstmt.setInt(1, pid);
			
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("Record deleted successfully");
			} else {
				System.out.println("Record not present");
			}
			
			// Update query using Prepared Statement
			
//			PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid = ?");
//			System.out.println("Enter the product ID");
//			int pid = sc.nextInt();
//				pstmt.setInt(2, pid);
//			
//				
//			System.out.println("Enter the price");
//			float price = sc.nextFloat();
//				pstmt.setFloat(1, price);
//			
//			int result = pstmt.executeUpdate();
//			if (result > 0) {
//				System.out.println("Record updated successfully");
//			}
			
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			System.err.println(e.toString());
		}

	}

}
