package com.spring.validations;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.spring.mvc.customvalid.CourseCode;

public class Customer {

	private String firstName;

	// Required Validations for Last Name attribute
	@NotNull(message = "LastName is required")
	@Size(min = 1, message = "LastName is required")
	private String lastName;

	// Number Range Validations
	@NotNull(message = "is required")
	@Min(value = 0, message = "value should be greater than or equal to zero")
	@Max(value = 10, message = "value should be less than or equal to 10")
	private Integer freePasses; // Here we changed from int to Integer to avoid
								// type conversion error while throwing notNull
								// message

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Pattern(regexp = "[a-zA-Z0-9]{5}", message = "Zipcode should be only 5 characters/numbers")
	private String zipcode;

	@CourseCode(value = {"LUV","TOPS"}, message = "must start with LUV")
	private String courseCode;

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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
