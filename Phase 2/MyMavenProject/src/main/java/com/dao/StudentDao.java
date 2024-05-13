package com.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.Student;

public class StudentDao {
	
	public int storeStudent(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "admin");
			PreparedStatement pstmt = con.prepareStatement("insert into students values (?,?,?,?,?)");
			pstmt.setInt(1, student.getPid());
			pstmt.setString(2, student.getPname());
			pstmt.setString(3, student.getPhone());
			pstmt.setString(4, student.getEmail());
			pstmt.setInt(5, student.getBatch());
			return pstmt.executeUpdate();
			
		} catch (Exception e ) {
			System.err.println(e);
			return 0;
			
		}
	}
	
	public int updateStudent(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "admin");
			PreparedStatement pstmt = con.prepareStatement("update students set batch = ? where pid = ?"); // change only the SQL statement
			pstmt.setInt(2, student.getPid()); // 2, because it is second in the SQL update
			pstmt.setInt(1, student.getBatch());
			return pstmt.executeUpdate();
			
		} catch (Exception e ) {
			System.err.println(e);
			return 0;
			
		}
	}
	
	public int deleteStudent(int pid) { //passing only the id, not the entire object
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "admin");
			PreparedStatement pstmt = con.prepareStatement("delete from students where pid = ?");
			pstmt.setInt(1, pid); // only pid, because we are not passing the object
			return pstmt.executeUpdate();
			
		} catch (Exception e ) {
			System.err.println(e);
			return 0;
			
		}
	}
	
//	public List<Student> findAllStudents() { 
//		java.util.List<E> listOfStudents = new ArrayList<Student>();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "admin");
//			PreparedStatement pstmt = con.prepareStatement("select * from students");
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				Student s = new Student();
//				s.setPid(rs.getInt(1));
//				s.setPname(rs.getString(2));
//				s.setPhone(rs.getString(3));
//				s.setEmail(rs.getString(4));
//				s.setBatch(rs.getInt(5));
//				listOfStudents.add(s);
//				
//				
//			}
//			
//		} catch (Exception e ) {
//			System.err.println(e);
//			return 0;
//			
//		}
//		return listOfStudents;
//	}

}
