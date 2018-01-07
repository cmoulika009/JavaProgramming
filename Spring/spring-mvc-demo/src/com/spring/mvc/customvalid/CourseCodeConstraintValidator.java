package com.spring.mvc.customvalid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//This is Helper Class which handles all the Business logic of the application
//Here we are passing CourseCode annotation and field type
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;

	// This method initializes the value that is entered
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	// Spring MVS will call this method at runtime which returns whether it is
	// valid or not. This method contains actual business logic
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result = false;
		if (theCode != null) {

			// loop thru course prefixes check to see if code matches any of the
			// course prefixes
			// result = theCode.startsWith(coursePrefix);

			for (String tempPrefix : coursePrefix) {
				result = theCode.startsWith(tempPrefix);

				// if we found a match then break out of the loop
				if (result) {
					break;
				}
			}

		} else {
			result = true;
		}
		return result;
	}

}
