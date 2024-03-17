package com.java.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcForms {
	static void SForms(StudentForms sf) throws SQLException  {
		 Connection connection= null;
		 PreparedStatement  statement =null;
		 
		 String url="jdbc:mysql://192.168.0.109/codebegun_test_db";
		 String userName="root";
		 String password="root";
		 
		 String insertQuery  ="insert into Student_forms(FirstName,LastName,MobileNumber,EmailID,Gender)"
		 		+"values (?,?,?,?,?)";
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			  connection =DriverManager.getConnection(url, userName, password);
			  //statement=  connection.createStatement();
			  statement=  connection.prepareStatement(insertQuery);
			  statement.setString(1, sf.getFirstname());
			  statement.setString(2, sf.getLastname());
			  statement.setLong(3, sf.getMobileNumber());
			  statement.setString(4, sf.getEmail());
			  statement.setString(5, sf.getGender());
		 
			   int noofRows= statement.executeUpdate();
			   System.out.println(noofRows);





			  

			  
		 }
		 catch (Exception e)
		 {
			 e.printStackTrace();
		 }
		 
		 

	}
		
	}


