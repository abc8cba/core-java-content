package com.project.jdbc.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.project.jdbc.utility.CustomerData;
import com.project.jdbc.utility.DbConnection;

public class TestDeleteOperationUsingCallableStatement {

	public static void main(String[] args) {
		
		Connection con = null;
		CallableStatement cs = null;
		Scanner s = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			cs = con.prepareCall("{call DELETE_CUSTOMER_RECORD(?,?)}");
			cs.registerOutParameter(2, java.sql.Types.VARCHAR);
			s = new Scanner(System.in);
			System.out.println("Enter customer id");
			int id = s.nextInt();
			cs.setInt(1, id);
			
			cs.execute();		
			
			String result = cs.getString(2);
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
CREATE PROCEDURE DELETE_CUSTOMER_RECORD(IN VID NUMERIC(10), OUT MESSAGE VARCHAR(100))

BEGIN
  START TRANSACTION;
		DELETE FROM TBL_CUSTOMER WHERE C_ID = VID;
  COMMIT;
  
  SET MESSAGE = 'Record has been deleted successfully';
END$$

drop procedure DELETE_CUSTOMER_RECORD;
 */
