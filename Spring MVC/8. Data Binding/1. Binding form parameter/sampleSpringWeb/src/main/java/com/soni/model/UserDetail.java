package com.soni.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDetail {
    private String username;
    private String email;
    private Integer age;
    private String phone;
    private Date dob;
    
    private Address userAddress;
}
