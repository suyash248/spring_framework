package com.soni.model;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.soni.custom.annotation.Hobby;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDetail {
	@NotEmpty
	@Size(min=6, max=16, message="Length of username must be between {min} & {max}.")
    private String username;
    
	@NotEmpty(message="email can not be empty.")
    @Email(message="Please provide valid email.")
    private String email;
    
	@Min(value=18, message="Value of age must be atleast {value}")
    private Integer age;
    
	@Size(min=10, max=10, message="phone no. should be of length {min}")
    private String phone;
    
    @Past(message="Please provide valid DOB")
    private Date dob;
    
    private String gender;
    
    @Hobby
    private String hobby;
    
    @Valid
    private Address userAddress;
}
