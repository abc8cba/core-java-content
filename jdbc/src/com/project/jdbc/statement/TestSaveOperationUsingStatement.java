package com.project.jdbc.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.project.jdbc.utility.CustomerData;
import com.project.jdbc.utility.DbConnection;

public class TestSaveOperationUsingStatement {

	public static void main(String[] args) {
		Connection con = DbConnection.getMysqlDbConnection();
		Statement st = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			//con = DbConnection.getOracleDbConnection();
			st = con.createStatement();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter customer id");
			int id = s.nextInt();
			System.out.println("Enter customer name");
			String name = s.next();
			System.out.println("Enter customer city");
			String city = s.next();
			
			int rows = st.executeUpdate("insert into tbl_customer(c_city,c_id, c_name) values('"+city+"', "+id+", '"+name+"')");
			if(rows>0) {
				System.out.println(rows+" Record inserted");
			}else {
				System.out.println("Failed to insert.");
			}
			CustomerData.showAllCustomer();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {			
			try {
				if(st != null)
					st.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
