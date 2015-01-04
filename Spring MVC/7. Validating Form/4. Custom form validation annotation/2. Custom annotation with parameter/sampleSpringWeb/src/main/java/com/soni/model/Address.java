package com.soni.model;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Address {
	private String city;
	
	//@NotEmpty(message="pin can not be empty.")
	private Integer pin;
	
	@NotEmpty(message="country can not be empty.")
	private String country;
}
