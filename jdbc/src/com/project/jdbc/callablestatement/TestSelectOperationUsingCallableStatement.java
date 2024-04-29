package com.project.jdbc.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.project.jdbc.utility.DbConnection;

public class TestSelectOperationUsingCallableStatement {

	public static void main(String[] args) {
		
		Connection con = null;
		CallableStatement cs = null;
		Scanner s = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			// con = DbConnection.getOracleDbConnection();
			cs = con.prepareCall("{call SEARCH_CUSTOMER_RECORD(?,?,?)}");
			
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			cs.registerOutParameter(3, java.sql.Types.VARCHAR);

			s = new Scanner(System.in);
			System.out.println("Enter customer id to search record");
			int cid = s.nextInt();
			cs.setInt(1, cid);
			cs.execute();
			
			String name = cs.getString(2);
			String city = cs.getString(3);
			System.out.println("Name = "+name+" City = "+city);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(cs != null)
					cs.close();
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


/*
DELIMITER $$
CREATE PROCEDURE SEARCH_CUSTOMER_RECORD(IN VID NUMERIC(10), OUT VNAME VARCHAR(40),OUT VCITY VARCHAR(40))

BEGIN
  SELECT C_NAME, C_CITY INTO VNAME, VCITY from tbl_customer WHERE C_ID = VID; 
  
END$$

drop procedure SEARCH_CUSTOMER_RECORD;
 */
