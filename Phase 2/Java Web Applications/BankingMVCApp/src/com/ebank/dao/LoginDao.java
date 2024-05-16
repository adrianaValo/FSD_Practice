package com.ebank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ebank.bean.Login;
import com.ebank.ressource.DbRessource;

public class LoginDao {

	
	public boolean singIn(Login login) {
		try {
			Connection con = DbRessource.getDbConnection();
PreparedStatement pstmt = con.prepareStatement("select * from login where emailid = ? and password = ? and typeofuser=?");
	pstmt.setString(1, login.getEmailid());
	pstmt.setString(2, login.getPassword());
	pstmt.setString(3, login.getTypeofuser());
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()) {
		return true;
	}
		} catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}
	
	public int singUp(Login login) {
		try {
			Connection con = DbRessource.getDbConnection();
PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?,?)");
	pstmt.setString(1, login.getEmailid());
	pstmt.setString(2, login.getPassword());
	pstmt.setString(3, login.getTypeofuser());
	return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}