package com.ebank.ressource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbRessource {

	public static Connection getDbConnection () {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebank", "root", "admin");
return con;
		} catch (Exception e) {
			System.err.println(e);
			return null;
		}
	}
}