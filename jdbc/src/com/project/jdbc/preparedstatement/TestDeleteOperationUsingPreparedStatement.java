package com.project.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.project.jdbc.utility.CustomerData;
import com.project.jdbc.utility.DbConnection;

public class TestDeleteOperationUsingPreparedStatement {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner s = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			//con = DbConnection.getOracleDbConnection();

			s = new Scanner(System.in);
			System.out.println("Enter id to delete record");
			int id = s.nextInt();
			
			ps = con.prepareStatement("delete tbl_customer where c_id = ? ");
			ps.setInt(1, id);
			int rows = ps.executeUpdate();
			if(rows>0) {
				System.out.println("Record is deleted successfully");
			}else {
				System.out.println("Failed to delete record");
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
