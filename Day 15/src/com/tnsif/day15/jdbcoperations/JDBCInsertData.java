package com.tnsif.day15.jdbcoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCInsertData 
{

	
	public static void main(String[] args) 
	{
	
		try 
		{

			// JDBC Driver Loading
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is load successfully");
			
			// Connection creation to Database			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnsif", "root", "Dattatray");
			System.out.println("Connection created successfully");
			
			// Create Statement
			Statement stmt=con.createStatement();
			
			System.out.println("Statement created succesfully");
			
			// SQL Query
			// String q = "INSERT INTO student VALUES(101, 'Aayan', 'Java', 83.89)";
			// String q = "INSERT INTO student VALUES(102, 'Datta', 'DBMS', 86.89)";
			
			// Execute SQL Query
			// boolean s = stmt.execute(q);
			
			// Input Data for Inserting into Database
			Scanner sc=new Scanner(System.in);
			int id=0;
			String name="";
			String subject="";
		
			double duration=0.0;
			PreparedStatement psmt=null;
			
			System.out.println("Enter the Student Id: ");
			id=sc.nextInt();
			System.out.println("Enter the Student name: ");
			name=sc.next();
			System.out.println("Enter the Subject: ");
			subject=sc.next();
			System.out.println("Enter the course percentage: ");
			duration=sc.nextDouble();
			psmt=con.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
			psmt.setInt(1,id);
			psmt.setString(2, name);
			psmt.setString(3, subject);
			psmt.setDouble(4, duration);
			int row =psmt.executeUpdate();
			System.out.println(row+" row affected");
		}
		
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
