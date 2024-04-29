package com.project.jdbc.statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.jdbc.utility.DbConnection;

public class TestCreateOperationUsingStatement {

	public static void main(String[] args) throws SQLException {
		Connection con = DbConnection.getMysqlDbConnection();
		Statement st = con.createStatement();
		st.executeUpdate("drop table tbl_customer");
		st.executeUpdate("CREATE TABLE TBL_CUSTOMER( C_ID INT PRIMARY KEY, C_NAME VARCHAR(40) NOT NULL, C_CITY VARCHAR(40))");
	}

}
