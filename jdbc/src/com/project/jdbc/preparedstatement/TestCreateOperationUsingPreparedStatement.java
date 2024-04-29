package com.project.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project.jdbc.utility.DbConnection;

public class TestCreateOperationUsingPreparedStatement {

	public static void main(String[] args) throws SQLException {
		Connection con = DbConnection.getMysqlDbConnection();
		PreparedStatement ps = null;
		ps = con.prepareStatement("drop table tbl_customer");
		ps.executeUpdate();
		ps = con.prepareStatement("CREATE TABLE TBL_CUSTOMER( C_ID INT PRIMARY KEY, C_NAME VARCHAR(40) NOT NULL, C_CITY VARCHAR(40))");
		ps.executeUpdate();
		
		
	}

}
