package com.project.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.project.jdbc.utility.CustomerData;
import com.project.jdbc.utility.DbConnection;

public class TestSaveOperationUsingPreparedStatement {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		Scanner s = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			ps = con.prepareStatement("insert into tbl_customer(c_id,c_name,c_city) values(?,?,?)");
			
			s = new Scanner(System.in);
			System.out.println("Enter customer id");
			int id = s.nextInt();
			ps.setInt(1, id);
			System.out.println("Enter customer name");
			String name = s.next();
			ps.setString(2, name);
			System.out.println("Enter customer city");
			String city = s.next();
			ps.setString(3, city);
			
			int rows = ps.executeUpdate();
			if(rows>0) {
				System.out.println("Record is saved successfully");
			}else {
				System.out.println("Failed to save record");
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
