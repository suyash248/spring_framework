package com.springinaction.springidol;

public class Performer {
	@Loggable
	public String perform(){
		System.out.println("PERFORMER INVOKED");
		return "performed";
	}
	public String enjoy(){
		System.out.println("ENJOY INVOKED");
		return "enjoyed";
	}
	@Loggable
	public String play(){
		System.out.println("PLAY INVOKED");
		return "played";
	}
}
