package com.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DBConnection {

	public static Connection setDBConnection() {
		Connection conn = null;

		try {
			ResourceBundle rs = ResourceBundle.getBundle("DBConn");
			String dbDriver = rs.getString("DB_DRIVER");
			String dburl = rs.getString("DB_URL");
			String dbuser = rs.getString("DB_USER");
			String dbPwd = rs.getString("DB_PASSWORD");
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(dburl, dbuser, dbPwd);
			System.out.println("Is connection closed:" + conn.isClosed());
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
}
