package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class JDBCConnection {

	public static void main(String[] args) {
		
		ResourceBundle labels = ResourceBundle.getBundle("com/hibernate/jdbc/dbParameters");
		String driver = labels.getString("DB_DRIVER");
		String url = labels.getString("DB_URL");
		String userName = labels.getString("DB_USER");
		String password = labels.getString("DB_PASSWORD");
		
		try{
			System.out.println("Connecting to Database");
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection Established Successfully");

		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
