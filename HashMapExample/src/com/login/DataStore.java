package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author moulika
 *
 *         This class is a temporary database for the application. Returns a
 *         matching value for the key from the hashmapDB. If the key match is
 *         not found then null will be returned.
 */
public class DataStore {

	// static Map<String, String> hashMapDB = new HashMap<String, String>();
	//
	// static {
	// hashMapDB.put("raghu", "secret");
	// hashMapDB.put("naveen", "topsecret");
	// }

	public String getUserPassowrd(String userName) {
		// "null" will be returned if the userName match is not found in the
		// hashMap
		// String storedPassword = hashMapDB.get(userName);
		String storedPassword = null;
		Connection conn = DBConnection.setDBConnection();
		PreparedStatement ps = null;
		try {
			// Create statement obj and send that to DB
			String sql = "SELECT * FROM USERS WHERE USER_NAME=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				storedPassword = rs.getString("USER_PWD");
			}
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return storedPassword;
	}

}
