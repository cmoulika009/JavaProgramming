package com.sring.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryList;
	private String[] language;
	private String gender;

	public Student() {
		System.out.println("In No-Arg Constuctor");
		countryList = new LinkedHashMap<String, String>();
		countryList.put("IND", "INDIA");
		countryList.put("BZ", "BRAZIL");
		countryList.put("FRN", "FRANCE");
		countryList.put("USA", "UNITES STATES");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public void setCountryList(LinkedHashMap<String, String> countryList) {
		this.countryList = countryList;
	}

	public String[] getLanguage() {
		return language;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
