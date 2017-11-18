package com.user;
public class UserBean {
int UserID;
String UserName;
String Sex,Address,State,Country,DOB;
String ContactNo;
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}


public int getUserID() {
	return UserID;
}
public void setUserID(int userID) {
	UserID = userID;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getSex() {
	return Sex;
}
public void setSex(String sex) {
	Sex = sex;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public String getContactNo() {
	return ContactNo;
}
public void setContactNo(String contactNo) {
	ContactNo = contactNo;
}

}
