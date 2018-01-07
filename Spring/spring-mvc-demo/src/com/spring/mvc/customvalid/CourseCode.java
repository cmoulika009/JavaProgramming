package com.spring.mvc.customvalid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//Define the actual class that contains Business Logic 'CourseCodeConstraintValidator'
@Constraint(validatedBy = CourseCodeConstraintValidator.class)

// Where can we apply this annotation i.e Method/Field
@Target({ ElementType.METHOD, ElementType.FIELD })

// How long to retent it
// retain this annotation in Java class file and process it at run time
@Retention(RetentionPolicy.RUNTIME)

// Special type of interface used for Custom Annotation
public @interface CourseCode {

	// Setup parameter attributes value,message

	// define default course code
	public String[] value() default "LUV";

	// define error message
	public String message() default "must start with LUV/TOPS";

	// define default groups
	public Class<?>[] groups() default {};

	// define default payloads
	public Class<? extends Payload>[] payload() default {};

}
