package com.soni.spring;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDetails {
   private String userName;
   private Integer userAge;
   private String userCity;
   
   public void displayDetails(){
	   System.out.println("NAME : "+getUserName());
	   System.out.println("AGE : "+getUserAge());
	   System.out.println("CITY : "+getUserCity());
   }
}
