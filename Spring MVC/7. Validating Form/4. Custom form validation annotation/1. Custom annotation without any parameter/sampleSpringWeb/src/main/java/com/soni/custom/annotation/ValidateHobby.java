package com.soni.custom.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidateHobby implements ConstraintValidator<Hobby, String> {

	public void initialize(Hobby hobby) {
			
	}

	public boolean isValid(String hobby, ConstraintValidatorContext ctx) {
		if(hobby==null)
			return false;
		if(hobby.matches("Music|Cricket|Football|Swiming")){
			return true;
		}
		return false;
	}
	
}
