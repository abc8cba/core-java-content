package com.project.jdbc.jdbcmethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.project.jdbc.utility.DbConnection;

public class DisplayColumnNames {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			ps = con.prepareStatement("select * from tbl_customer");
			rs = ps.executeQuery();	
			ResultSetMetaData metaData = rs.getMetaData();
			System.out.println(metaData.getColumnName(1)
					+"     "+metaData.getColumnName(2)
					+"     "+metaData.getColumnName(3));
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String city = rs.getString(3);
				System.out.println(id+"      "+name+"     "+city);
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
