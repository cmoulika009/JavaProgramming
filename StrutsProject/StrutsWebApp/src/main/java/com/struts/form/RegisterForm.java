package com.struts.form;

public class RegisterForm {

	private String iUsername;
	private String iPassword;
	private String cPassword;
	
	public String getiUsername() {
		return iUsername;
	}
	public void setiUsername(String iUsername) {
		this.iUsername = iUsername;
	}
	public String getiPassword() {
		return iPassword;
	}
	public void setiPassword(String iPassword) {
		this.iPassword = iPassword;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	
}
