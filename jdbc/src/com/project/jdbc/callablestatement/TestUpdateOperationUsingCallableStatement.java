package com.project.jdbc.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.project.jdbc.utility.CustomerData;
import com.project.jdbc.utility.DbConnection;

public class TestUpdateOperationUsingCallableStatement {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cs = null;
		Scanner s = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			cs = con.prepareCall("{call UPDATE_CUSTOMER_RECORD(?,?,?)}");
			cs.registerOutParameter(3, java.sql.Types.VARCHAR);
			s = new Scanner(System.in);
			System.out.println("Enter customer id");
			int id = s.nextInt();
			cs.setInt(1, id);
			System.out.println("Enter customer city");
			String city = s.next();
			cs.setString(2, city);
			
			cs.execute();		
			
			String result = cs.getString(3);
			System.out.println(result);
			
			CustomerData.showAllCustomer();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
CREATE PROCEDURE UPDATE_CUSTOMER_RECORD(IN VID NUMERIC(10), IN VCITY VARCHAR(40), OUT MESSAGE VARCHAR(100))

BEGIN
  START TRANSACTION;
		UPDATE TBL_CUSTOMER SET C_CITY = VCITY WHERE C_ID = VID;
  COMMIT;
  
  SET MESSAGE = 'Data has been updated successfully';
END$$

drop procedure UPDATE_CUSTOMER_RECORD;
 */
