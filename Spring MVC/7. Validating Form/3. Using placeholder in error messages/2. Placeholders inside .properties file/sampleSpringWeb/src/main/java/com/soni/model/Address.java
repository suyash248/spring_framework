package com.soni.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Address {
	private String city;
	
	@NotEmpty
	private Integer pin;
	private String country;
}
