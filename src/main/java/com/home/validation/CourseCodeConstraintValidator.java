package com.home.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * CourseCode- our annotation
 * String - type of data to validate against.
 * 
 * @author Avinash
 *
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	/**
	 * It contains the value mentioned by the developer i.e starting value of the courseCode
	 */
	public void initialize(CourseCode coursePrefix) {
		this.coursePrefix = coursePrefix.value();
	}
	
	/**
	 * 
	 * @param value the value entered by the user
	 * @param context we can pass additional error message over here
	 * @return return true when value starts with coursePrefix
	 * 
	 */
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if( value != null) {
			return value.startsWith(coursePrefix);
		}
		else {
			// if we make it as false, then it will prompt the message "must start with LUV", which we don't want.
			return true;
		}
	}

}
