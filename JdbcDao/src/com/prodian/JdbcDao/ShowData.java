package com.prodian.JdbcDao;
import java.sql.*;


public class ShowData {

	 static String query = "select * from Users ";

       
        	ShowData () throws Exception {
       		
       		crudDAO dao = new crudDAO();
       	 Statement stmt=dao.con.createStatement();
       		ResultSet rs = stmt.executeQuery(query);   
       		System.out.println("id   name   email  ");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
               
                System.out.println(id + ":   " + name + ":   " + email );
            
        			
       	}
            stmt.close();
    		dao.closeConnection();
        	
        	}
        	}
