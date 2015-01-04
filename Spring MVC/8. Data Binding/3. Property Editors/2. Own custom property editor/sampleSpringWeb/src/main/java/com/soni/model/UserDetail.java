package com.soni.model;

import java.util.Date;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDetail {
	@NotEmpty(message="Username can not be empty")
    private String username;
    
	@NotEmpty(message="Email can not be empty")
    @Email(message="Please provide valid email")
    private String email;
    
    private Integer age;
    
    private String phone;
    
    private Date dob;
    
    @NotEmpty(message="Please select the gender")
    private String gender;
    
    private Address userAddress;
}
