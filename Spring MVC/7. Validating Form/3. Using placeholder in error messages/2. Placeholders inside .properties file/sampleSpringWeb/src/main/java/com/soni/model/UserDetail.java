package com.soni.model;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDetail {
	@NotEmpty
	@Size(min=6, max=16)
    private String username;
    
	@NotEmpty
    @Email
    private String email;
    
	@Min(value=18)
    private Integer age;
    
	@Size(min=10, max=10)
    private String phone;
    
    @Past
    private Date dob;
    
    private String gender;
    
    @Valid
    private Address userAddress;
}
