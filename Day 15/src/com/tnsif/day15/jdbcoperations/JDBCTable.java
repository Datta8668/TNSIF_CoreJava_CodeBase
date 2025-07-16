package com.tnsif.day15.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JDBCTable 
{

	
	public static void main(String[] args) 
	{

		
		try 
		{
			
			// JDBC Driver Loading
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is load successfully");
			
			// Connection creation to Database			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/TNSIF", "root", "Dattatray");
			System.out.println("Connection created successfully");
			
			// Create Statement
			Statement stmt=con.createStatement();
			
			System.out.println("Statement created succesfully");
			
			// SQL Query
			String q = "CREATE TABLE student(Std_id INT, Name VARCHAR(20), Subject VARCHAR(20), Percentage DOUBLE)";
			
			// Execute SQL Query
			boolean s=stmt.execute(q);
			
		}
		
		catch(Exception e)
		{
			System.err.println(e);
		}

		
	}

	
}
