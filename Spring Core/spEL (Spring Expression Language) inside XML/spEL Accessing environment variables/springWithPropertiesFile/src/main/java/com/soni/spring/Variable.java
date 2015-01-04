package com.soni.spring;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Variable {
   private String mavenHome;
   private String javaHome;
   
   public void displayDetails(){
	   System.out.println("M2_HOME : "+getMavenHome());
	   System.out.println("JAVA_HOME : "+getJavaHome());
   }
}
