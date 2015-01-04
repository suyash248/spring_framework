package com.soni.model;

import com.soni.service.Shape;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Square implements Shape {
		
	public void draw(){
		System.out.println("Drawing Square");
	}
}
