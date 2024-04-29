package com.project.jdbc.utility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerData {

	public static void showAllCustomer() {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			// con = DbConnection.getOracleDbConnection();
			st = con.createStatement();
			rs = st.executeQuery("select * from tbl_customer");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String city = rs.getString(3);
				System.out.println("Id = " + id + " Name = " + name + " City = " + city);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(st != null)
					st.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
