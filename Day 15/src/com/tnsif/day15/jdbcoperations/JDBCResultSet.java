package com.tnsif.day15.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JDBCResultSet
{

	
	public static void main(String[] args) 
	{

		
		try 
		{
			
			// JDBC Driver Loading
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is load successfully");
			
			// Connection creation to Database			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnsif", "root", "root123");
			System.out.println("Connection created successfully");
			
			// Create Statement
			Statement stmt=con.createStatement();
			
			System.out.println("Statement created succesfully");
			
			// SQL Query
			java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM student");
			System.out.println("stdid" + "   " + "name" + "   " + "subject" + "   " + "duration");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+
						"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
			}
			
		}
		
		catch(Exception e)
		{
			System.err.println(e);
		}

		
	}
	
	
}

