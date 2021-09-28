package com.prodian.JdbcCrud;
import java.sql.*;

public class FetchData {

	 static String query = "select * from Users where id =?";

	    public static void main(String[] args) throws SQLException 
	    {
	    	FetchData fetchData=new FetchData();
	    	fetchData.fetchRecord();
	    }
	    
	    	public void fetchRecord() throws SQLException {
	    	
	    	 Connection con=new EstablishConnection().getConnection();     
	       
	            PreparedStatement preparedStatement = con.prepareStatement(query);
	            {
	            preparedStatement.setInt(1, 2);
	            System.out.println(preparedStatement);
	            
	            ResultSet rs = preparedStatement.executeQuery();

	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String email = rs.getString("email");
	               
	                System.out.println(id + "," + name + "," + email );
	               
	            }
	            }
	        }
	   }
