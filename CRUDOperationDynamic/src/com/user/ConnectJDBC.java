package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
	private static Connection conn;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			String url = "jdbc:mysql://localhost:3306/samplejdbc";
			String usn = "root";
			String pwd = "omganesh@9";
			conn = DriverManager.getConnection(url, usn, pwd);
			System.out.println("CONNECTION CREATED SUCCESSFULLY");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}
}
