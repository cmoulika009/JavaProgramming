package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

	private static Connection conn;

	public UserDao() {
		conn = ConnectJDBC.getConnection();
	}

	public int createUserID(UserBean userbean) {

		int userid = 0;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select seq_user.nextval from dual");
			if (rs.next()) {
				userid = (rs.getInt(1));
				System.out.println(userid);
			}
			PreparedStatement ps = conn.prepareStatement(
					"insert into registration(UserId,UserName,Sex,Address,State,Country,ContactNo,DOB) values(" + userid
							+ ",?,?,?,?,?,?,?)");
			ps.setString(1, userbean.getUserName());
			ps.setString(2, userbean.getSex());
			ps.setString(3, userbean.getAddress());
			ps.setString(4, userbean.getState());
			ps.setString(5, userbean.getCountry());
			ps.setString(6, userbean.getContactNo());
			ps.setString(7, userbean.getDOB());
			ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userid;
	}

	public List<UserBean> viewUser() {
		List<UserBean> vblist = new ArrayList<UserBean>();
		try {

			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select UserId,UserName from registration");
			while (rs.next()) {
				UserBean usebean = new UserBean();
				usebean.setUserID(rs.getInt("UserID"));
				usebean.setUserName(rs.getString("UserName"));
				vblist.add(usebean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vblist;
	}

	public static ArrayList<UserBean> viewUserDetails(UserBean userbean) {
		ArrayList<UserBean> blist = new ArrayList<UserBean>();
		try {

			System.out.println(userbean.getUserID());
			String string = "select UserName,Sex,DOB,Address,State,Country,ContactNo from registration where UserID ='"
					+ userbean.getUserID() + "'";
			Statement ps = conn.createStatement();

			ResultSet rs = ps.executeQuery(string);
			rs.next();
			System.out.println(rs.getString(1));
			userbean.setUserName(rs.getString(1));
			userbean.setSex(rs.getString(2));
			userbean.setDOB(rs.getString(3));
			userbean.setAddress(rs.getString(4));
			userbean.setState(rs.getString(5));
			userbean.setCountry(rs.getString(6));
			userbean.setContactNo(rs.getString(7));
			blist.add(userbean);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return blist;

	}

	public void updateUser(UserBean pb) {

		try {

			System.out.println(pb.getUserID());
			String query = "update registration set UserName='" + pb.getUserName() + "',Sex='" + pb.getSex() + "',DOB='"
					+ pb.getDOB() + "',Address='" + pb.getAddress() + "',State='" + pb.getState() + "',Country='"
					+ pb.getCountry() + "',ContactNo='" + pb.getContactNo() + "' where UserId ='" + pb.getUserID()
					+ "'";
			Statement ps = conn.createStatement();
			ps.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
