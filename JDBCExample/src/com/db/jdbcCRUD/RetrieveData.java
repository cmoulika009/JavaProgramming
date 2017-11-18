package com.db.jdbcCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.setDBConnection();
		RetrieveData rd = new RetrieveData();
		// rd.getUserRecord(conn, "HEMA");
		rd.getUserRecordPrepareSmt(conn, "SUBHASH",2);
	}

	private void getUserRecord(Connection con, String un) {
		try {
			// Create statement obj and send that to DB
			Statement smt = con.createStatement();
			String sql = "SELECT * FROM EMPLOYEE WHERE EMP_NAME='" + un + "'";
			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				System.out.println("Emp id:" + rs.getInt("EMP_ID"));
				System.out.println("Emp Name:" + rs.getString("EMP_NAME"));
				System.out.println("Emp Desg:" + rs.getString("EMP_DES"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void getUserRecordPrepareSmt(Connection con, String un, int id) {
		PreparedStatement ps = null;
		try {
			// Create statement obj and send that to DB
			String sql = "SELECT * FROM EMPLOYEE WHERE EMP_NAME=? AND EMP_ID=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, un);
			ps.setInt(2, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("Emp id:" + rs.getInt("EMP_ID"));
				System.out.println("Emp Name:" + rs.getString("EMP_NAME"));
				System.out.println("Emp Desg:" + rs.getString("EMP_DES"));
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
