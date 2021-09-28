package com.prodian.JdbcMultipleTable;
import java.sql.*;

public class MultipleTable {
	
	
		public static void main(String[] args)
		{
			System.out.println("Joining 2 MySQL tables using  Join");

			Connection con = null;

			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");

			
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tables","root", "Mahesh@312");

				try {
					Statement st = con.createStatement();
					
					ResultSet res = st.executeQuery(
						"SELECT *FROM "
						+ "studentsdetails"
						+ " JOIN "
						+ "studentspersonaldetails");

					// Step 5: Execute the query
					System.out.println("StuName"
									+ " Gender"
									+ "	Caste "
									+ " Neet Marks"
									+ "	Email"
									+ "	Address");

					while (res.next()) {
						String name = res.getString("Name");
						String gender = res.getString("gender");
						String caste = res.getString("caste");
						String neetMarks = res.getString("NeetMarks");
						String email = res.getString("email");
						String Address = res.getString("Address");

						// Beautification of output
						System.out.format(
							"%5s%7s%6s%10s%18s%10s\n", name,
							gender, caste, neetMarks, email,Address);
					}
					con.close();
				}

				catch (SQLException s) {

					System.out.println("SQL statement is not executed!");
				}
			}
			catch (Exception e) {

				e.printStackTrace();
			}
		}
	}



