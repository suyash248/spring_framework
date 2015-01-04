package com.springinaction.springidol;

public class Performer {

	public String perform(String performerName, int performerAge){
		System.out.println("PERFORMER INVOKED");
		throw new RuntimeException();
	}
}
