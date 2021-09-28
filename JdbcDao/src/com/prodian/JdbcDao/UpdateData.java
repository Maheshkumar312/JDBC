package com.prodian.JdbcDao;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {


		UpdateData() throws Exception {
			new ShowData();
			Scanner sc1 = new Scanner(System.in);
			String constrainname,name,email;
			System.out.println(" Enter the name to Modify  ");
			constrainname = sc1.nextLine();
			System.out.println(" Enter the new name ");
			name = sc1.nextLine();
			System.out.println(" Enter the new email");
			email = sc1.nextLine();
			String sql = "UPDATE users SET name = '"+name+"', email= '" +email+ "' where name = '"+constrainname+"';";
			crudDAO dao = new crudDAO();
			 Statement stmt=dao.con.createStatement();
			int temp = stmt.executeUpdate(sql);
			if(temp==1)
			{
				System.out.println("  Data Updated Successfully !!");
				System.out.println("  Shows Updated Data !!");
				new ShowData();
			}
			else
				System.out.println("  Data Not Updated Successfully");
			
			
			stmt.close();
			dao.closeConnection();
				
		}
	}

