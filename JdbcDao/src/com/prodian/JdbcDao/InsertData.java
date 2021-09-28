package com.prodian.JdbcDao;
import java.sql.*;
import java.util.Scanner;

public class InsertData {

	
	InsertData() throws Exception
		{
			Scanner sc1 = new Scanner(System.in);
			
			System.out.println(" Enter the id");
			String id= sc1.nextLine();
			
			System.out.println(" Enter the First Name");
			String name = sc1.nextLine();
			System.out.println(" Enter the Last Name");
			String email = sc1.nextLine();
			String sql = "INSERT INTO users values ('"+id+"','"+name+"','"+email+"');";
			System.out.println(sql);
			crudDAO dao = new crudDAO();
			 Statement stmt=dao.con.createStatement();
			int temp = stmt.executeUpdate(sql);
	
			
			if(temp==1)
			{
				System.out.println("  Data Stored Successfully !!");
				System.out.println("  Shows Updated Data !!");
				new ShowData();
			}
			else
				System.out.println("  Give Please proper data !!");
			System.out.println(" ------------------------------------------------------------- ");
			
			stmt.close();
			dao.closeConnection();
				
		}
	
	}
	

