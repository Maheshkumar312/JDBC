package com.prodian.JdbcDemo;

import java.sql.*;
;

public class FetchData {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/jdbc";
		String uname="root";
		String pass="Mahesh@312";
		String query="select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs =st.executeQuery(query);
		String userData="";
		   while(rs.next())
		   {
		 userData=rs.getInt(1)+":"+rs.getString(2);
		 System.out.println(userData);
		    }
		st.close();
		con.close();
		
	

	}

}
