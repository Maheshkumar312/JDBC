package com.prodian.JdbcDao;
import java.sql.*;

public class crudDAO
  {
    Statement stmt;
	Connection con;
	
	 crudDAO() throws ClassNotFoundException, SQLException 
	 {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","Mahesh@312");
		stmt=con.createStatement();
	}
	 void closeConnection() throws Exception 
	 {
	con.close();
	 
	     }

 
}