package com.springinaction.springidol;

public class Performer {

//	public int perform(){
//		System.out.println("PERFORMER INVOKED");
//		return 78;
//	}
	public int validateAge(int age){
		if(age<18){
			throw new ArithmeticException();
		}
		else{
			System.out.println("Valid Artist from validateAge");
		}
		return age;
	}
}
