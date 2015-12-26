package com.springinaction.springidol;

import javax.management.RuntimeErrorException;

public class Performer {

	public String perform(String performerName, int performerAge){
		System.out.println("PERFORMER INVOKED");
		return "Singer";
	}
}
