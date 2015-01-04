package com.soni.custom.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

public class ValidateHobby implements ConstraintValidator<Hobby, String> {

	private String[] hobbies;
	public void initialize(Hobby hobby) {
		this.hobbies = hobby.hobbies();
	}

	public boolean isValid(String userHobby, ConstraintValidatorContext ctx) {
		if(StringUtils.isEmpty(userHobby)) {
			return false;
		}
		else{
			for(String validHobby : hobbies) {
				if(userHobby.equals(validHobby)) {
					return true;
				}
			}
			return false;
		}
	}
	
}
