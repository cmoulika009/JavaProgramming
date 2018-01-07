package com.db.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.ResourceBundle;

public class JDBCDemoExample {
	public static void main(String[] args) {
		try {
			ResourceBundle rs = ResourceBundle.getBundle("DBConn");
			String dbDriver = rs.getString("DB_DRIVER");
			String dburl = rs.getString("DB_URL");
			String dbuser = rs.getString("DB_USER");
			String dbPwd = rs.getString("DB_PASSWORD");
			
			Class.forName(dbDriver);
			
			Connection conn=DriverManager.getConnection(dburl,dbuser,dbPwd);
			System.out.println("Is connection closed:"+conn.isClosed());
			
			JDBCDemoExample jd=new JDBCDemoExample();
			jd.insertRecord(conn);
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void insertRecord(Connection conn){
		try{
			//Create statement obj and send that to DB
			Statement smt=conn.createStatement();
			
			int recordCnt=smt.executeUpdate("insert into EMPLOYEE VALUES(3,'HEMA','TEAM LEAD')");
			System.out.println("Record Count:"+recordCnt);
			recordCnt=smt.executeUpdate("insert into EMPLOYEE VALUES(4,'MUKUNDA','TECH LEAD')");
			System.out.println("Record Count:"+recordCnt);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
