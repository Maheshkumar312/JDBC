package com.prodian.JdbcInsertData;
import java.sql.*;

public class InsertData {

	public static void main(String[] args)  throws Exception
	{
		String url="jdbc:mysql://localhost:3306/jdbc";
		String uname="root";
		String pass="Mahesh@312";
		int id =5;
		String name="yash";
		String query="insert into student values(?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1,id);
		st.setString(2,name);
	   int count =st.executeUpdate();
	   System.out.println( count +"rows affected");
		
		st.close();
		con.close();
		
	

	}

}
