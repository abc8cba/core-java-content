package com.project.jdbc.utility;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		Connection con = DbConnection.getMysqlDbConnection();
		//Connection con = DbConnection.getOracleDbConnection();
		if(con != null)
			System.out.println("Connected");
		else
			System.out.println("Not Connected...");
	}

}
