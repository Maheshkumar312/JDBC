package com.prodian.JdbcCrud;
import java.sql.*;

public class InsertData
   {
	String query = "insert into users values(?, ?, ?)";

    public static void main(String[] argv) throws SQLException {
    	InsertData createTable = new InsertData();
        createTable.insertRecord();
    }

    public void insertRecord() throws SQLException {
       
            
             Connection con=new EstablishConnection().getConnection();
            PreparedStatement preparedstatement= con.prepareStatement(query );
            {
            preparedstatement.setInt(1, 12);
            preparedstatement.setString(2, "Tony");
            preparedstatement.setString(3, "tony@gmail.com");
           int data= preparedstatement.executeUpdate();

            System.out.println(data+" row affected");
            preparedstatement.close();
           
            
          } 
     }
   }

        

    
    



