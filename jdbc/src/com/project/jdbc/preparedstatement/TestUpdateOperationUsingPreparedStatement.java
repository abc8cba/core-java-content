package com.project.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.project.jdbc.utility.CustomerData;
import com.project.jdbc.utility.DbConnection;

public class TestUpdateOperationUsingPreparedStatement {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner s = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			//con = DbConnection.getOracleDbConnection();
			ps = con.prepareStatement("update tbl_customer set c_city = ? where c_id = ?");
			
			s = new Scanner(System.in);
			System.out.println("Enter customer id");
			int id = s.nextInt();
			ps.setInt(2, id);
			System.out.println("Enter customer city");
			String city = s.next();
			ps.setString(1, city);
			
			int rows = ps.executeUpdate();
			if(rows>0) {
				System.out.println("Record is updated successfully");
			}else {
				System.out.println("Failed to update record");
			}
			
			CustomerData.showAllCustomer();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null)
					ps.close();
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
