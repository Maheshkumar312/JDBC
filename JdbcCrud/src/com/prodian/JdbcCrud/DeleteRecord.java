package com.prodian.JdbcCrud;
import java.sql.*;

public class DeleteRecord {
	


	    String query = "delete from users where id = ?;";

	    public static void main(String[] argv) throws SQLException {
	    	 DeleteRecord deleteRecord = new DeleteRecord();
	    	 deleteRecord .deleteRecord();
	    }

	    public void deleteRecord() throws SQLException {
	    	 Connection con=new EstablishConnection().getConnection();     
	            PreparedStatement statement = con.prepareStatement( query );
	            {
	            statement.setInt(1, 12);
	  
	            int result = statement.executeUpdate();
	            System.out.println("Number of records deleted:: " + result);
	            statement.close();
	        } 
	    }

	    }
	


