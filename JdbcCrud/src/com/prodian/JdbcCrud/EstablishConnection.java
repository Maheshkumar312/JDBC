package com.prodian.JdbcCrud;

import java.sql.*;

public class EstablishConnection {

	public static Connection getConnection() throws SQLException {
		 String url = "jdbc:mysql://localhost:3306/jdbc_demo";
	     String username = "root";
	     String password = "Mahesh@312";
	     Connection con = null;
	     Statement preparedStatement  = null;  
	     try 
	     {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con = DriverManager.getConnection(url, username, password);
	     } 
	     catch (Exception e) 
	     {
	        // TODO Auto-generated catch block
	    	
	        e.printStackTrace();
	    }

	    
	    return con;
	    }
	
	}

