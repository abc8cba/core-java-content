package com.project.jdbc.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

private static Connection con = null;
	
	public static Connection getOracleDbConnection(){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sandeep", "sandeep");
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    return con;
	}
	
	public static Connection getMysqlDbConnection(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sandydb", "root", "j0j0p@ssw0rd");
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    return con;
	}
}
