package com.project.jdbc.jdbcmethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.jdbc.utility.DbConnection;

public class CursorMovementBiDirectional {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			ps = con.prepareStatement("select * from tbl_customer",
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			
			rs = ps.executeQuery();
			rs.absolute(5);
			while(rs.previous()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String city = rs.getString(3);
				System.out.println("Id: "+id+" Name: "+name+" City: "+city);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)
					rs.close();
				if(ps != null)
					ps.close();
				if(con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}

}
