package com.springinaction.springidol;

public class MindReaderImpl implements MindReader {
	private String thoughts;
	public void interceptThoughts(String thoughts) {
		System.out.println("BEFORE ADVICE - Intercepting thoughts : "+thoughts);
		this.thoughts = thoughts;
	}
	public String getThoughts() {
		return thoughts;
	}
}
