package com.soni.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDetail {
	@Size(min=2, max=30) 
    private String username;
      
    @NotEmpty @Email
	/*@Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,4}", message="Invalid email address") */
    private String email;
      
    @NotNull @Min(18) @Max(100)
    private Integer age;
      
    @Pattern(regexp="^[0-9]+$", message="phone must contain numeric value")
    @Size(min=10, max=10)
    private String phone;
    
}
