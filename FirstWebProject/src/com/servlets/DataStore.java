package com.servlets;

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

	public String getUserPassowrd(String userName) {
		// "null" will be returned if the userName match is not found in the
		// hashMap
		HashMap<String, String> hashMapDB = new HashMap<String, String>();
		hashMapDB.put("raghu", "secret");
		hashMapDB.put("naveen", "topsecret");
		String storedPassword = hashMapDB.get(userName);
		return storedPassword;
	}

}
