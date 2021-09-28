package com.prodian.JdbcDao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DeleteData {

	DeleteData() throws Exception 
		{
			new ShowData();
			Scanner sc1 = new Scanner(System.in);
			String delname;
			System.out.println(" Enter the id as which row You would Like to Delete !! ");
			delname = sc1.nextLine();
			String sql = "DELETE FROM users where id = '"+delname+"';";
			crudDAO dao = new crudDAO();
			 Statement stmt=dao.con.createStatement();
			int temp = stmt.executeUpdate(sql);
			
			if(temp==1)
			{
				System.out.println("  Data Deleted Successfully !!");
				System.out.println("  Shows Updated data !!");
				new ShowData();
			}
			else
				System.out.println("  Data Not Deleted Successfully ");
			
		stmt.close();
		dao.closeConnection();
			
		}


	}

