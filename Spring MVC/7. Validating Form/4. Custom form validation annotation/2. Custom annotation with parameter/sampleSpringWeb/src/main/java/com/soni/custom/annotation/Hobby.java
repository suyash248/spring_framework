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
	String[] hobbies() default {"Music", "Cricket", "Football", "Swimming"};	// Here if we don't specify default values then 'hobbies' attribute will become mandatory.
	
	String message() default "Please provide a valid hobby.";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
