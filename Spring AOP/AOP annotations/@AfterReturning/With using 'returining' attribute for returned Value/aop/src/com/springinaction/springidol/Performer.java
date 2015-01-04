package com.springinaction.springidol;

public class Performer {

	public String perform(String performerName, int performerAge){
		System.out.println("PERFORMER INVOKED");
		return "Singer";
	}
	public int enjoy(String enjoyerName, int enjoyerAge){
		System.out.println("ENJOY NINVOKED");
		return 18;
	}
}
