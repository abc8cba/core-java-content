package com.project.jdbc.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.project.jdbc.utility.CustomerData;
import com.project.jdbc.utility.DbConnection;

public class TestUpdateOperationUsingStatement {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		Scanner s = null;
		try {
			CustomerData.showAllCustomer();
			System.out.println("--------------------------------------");
			con = DbConnection.getMysqlDbConnection();
			//con = DbConnection.getOracleDbConnection();
			st = con.createStatement();
			s = new Scanner(System.in);
			System.out.println("Enter customer id");
			int id = s.nextInt();
			System.out.println("Enter customer city to update");
			String city = s.next();
			
			int rows = st.executeUpdate("update tbl_customer set c_city = '"+city+"' where c_id = "+id+" ");
			if(rows>0) {
				System.out.println(rows+" Record updated");
			}else {
				System.out.println("Failed to update.");
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
				if(s != null) {
					s.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
