package com.soni.spring;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Variable {
   
   private String osName;
   private String osVersion;
   
   public void displayDetails(){
	   System.out.println("os.name : "+getOsName());
	   System.out.println("os.version : "+getOsVersion());
   }
}
