package com.project.jdbc.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.project.jdbc.utility.CustomerData;
import com.project.jdbc.utility.DbConnection;

public class TestSaveOperationUsingCallableStatement {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cs = null;
		Scanner s = null;
		try {
			con = DbConnection.getMysqlDbConnection();
			cs = con.prepareCall("{call SAVE_CUSTOMER_RECORD(?,?,?,?)}");
			cs.registerOutParameter(4, java.sql.Types.VARCHAR);
			s = new Scanner(System.in);
			System.out.println("Enter customer id");
			int id = s.nextInt();
			cs.setInt(1, id);
			System.out.println("Enter customer name");
			String name = s.next();
			cs.setString(2, name);
			System.out.println("Enter customer city");
			String city = s.next();
			cs.setString(3, city);
			
			cs.execute();		
			
			String result = cs.getString(4);
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
CREATE PROCEDURE SAVE_CUSTOMER_RECORD(IN VID NUMERIC(10), IN VNAME VARCHAR(40), IN VCITY VARCHAR(40), OUT MESSAGE VARCHAR(100))

BEGIN
  START TRANSACTION;
		INSERT INTO TBL_CUSTOMER VALUES(VID, VNAME, VCITY);
  COMMIT;
  
  SET MESSAGE = 'Data hase been saved successfully';
END$$

drop procedure SAVE_CUSTOMER_RECORD;
 */
