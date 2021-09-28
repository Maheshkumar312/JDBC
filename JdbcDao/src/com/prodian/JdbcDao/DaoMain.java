package com.prodian.JdbcDao;
import java.util.Scanner;
import java.lang.*;
import java.sql.*;


public class DaoMain {

		public static void main(String[] args) throws Exception {
			
			Scanner sc = new Scanner(System.in);
			int no;
			
			do {
				System.out.println("---------- Database Operations ------------------ :");
				System.out.println("    1. Show the Data :");
				System.out.println("    2. Insert the Data :");
				System.out.println("    3. Delete the Data :");
				System.out.println("    4. Update the Data :");
				System.out.println("    5. Exit :");

				System.out.println("Enter Your operation :");
				no = sc.nextInt();
				
				if(no==1) {
					new ShowData();	
				}
				else if(no==2) {
					new InsertData();
				}
				else if(no==3) {
					new DeleteData();
				}
				else if(no==4) {
					new UpdateData();
				}
				else if(no==5) {
					System.out.println("you entered exit");
				}
				else
				{
					System.out.println(" Enter The Valid Number !!");
				}
					
			}while(no<=4 && no>=1);
			
			System.out.println(" ----------- ***  EXIT  **** ----------------");
			
		}
		
	

	}

