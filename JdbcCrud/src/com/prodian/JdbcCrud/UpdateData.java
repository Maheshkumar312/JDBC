package com.prodian.JdbcCrud;
import java.sql.*;


public class UpdateData {
	String query = "update users set email = ? where id = ?;";  

    public static void main(String[] argv) throws SQLException {
    	UpdateData updateData = new UpdateData();
    	 updateData.updateRecord();
    }

    public void updateRecord() throws SQLException {
    	 Connection con=new EstablishConnection().getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(query);
        	{
            preparedStatement.setString(1, "Ram@gmail");
            preparedStatement.setInt(2, 1);

            // Execute the query or update query
            preparedStatement.executeUpdate();
            System.out.println(preparedStatement);
            preparedStatement.close();
        } 

    }
}