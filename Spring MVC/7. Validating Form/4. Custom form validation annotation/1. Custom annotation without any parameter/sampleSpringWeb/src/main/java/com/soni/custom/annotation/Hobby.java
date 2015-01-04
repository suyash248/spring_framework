package com.soni.custom.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=ValidateHobby.class)
@Target(value=ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Hobby {
	String message() default "Please provide valid hobby. Valid hobbies are : Music|Cricket|Football|Swiming";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
