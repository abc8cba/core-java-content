package com.project.jdbc.jdbcmethods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.project.jdbc.utility.DbConnection;

public class TestOfExecuteMethod {

	public static void main(String[] args) throws Exception {
		
		Connection con = DbConnection.getMysqlDbConnection();
		Statement st = con.createStatement();
		
		boolean b1 = st.execute("drop table tbl_customer");//DDL
		if (b1 == false) {
			System.out.println("TBL_CUSTOMER table dropped");
		} else {
			System.out.println("Table does not exist");
		}

		boolean b2 = st.execute(
				"CREATE TABLE TBL_CUSTOMER( C_ID INT PRIMARY KEY, C_NAME VARCHAR(40) NOT NULL,   C_CITY VARCHAR(40))");
		if (b2 == false) {
			System.out.println("TBL_CUSTOMER table created successfully..");
		}

		boolean b3 = st.execute("insert into TBL_CUSTOMER values(103,'Dinesh','Mumbai')");//DML
		if (b3 == false) {
			System.out.println("Record inserted successfully..");
		}

		boolean b4 = st.execute("select * from TBL_CUSTOMER");//DQL 
		if (b4 == true) {
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String city = rs.getString(3);
				System.out.println(id + "  " + name + "  " + city);
			}
		}

	}

}
