package com.project.jdbc.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.project.jdbc.utility.CustomerData;
import com.project.jdbc.utility.DbConnection;

public class TestSelectOperationUsingStatement {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		Scanner s = null;
		ResultSet rs = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			// con = DbConnection.getOracleDbConnection();
			st = con.createStatement();

			s = new Scanner(System.in);
			System.out.println("Enter customer id to search record");
			int cid = s.nextInt();
			rs = st.executeQuery("select * from tbl_customer where c_id= " + cid + " ");
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
				if(s != null)
					s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
