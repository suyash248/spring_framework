package com.soni.service;

import com.soni.aspect.LoggingAspect;
import com.soni.model.Circle;

public class CircleProxy extends Circle {
	public void draw(){
		//Before advice
		LoggingAspect aspect = new LoggingAspect();
		
		aspect.beforeDrawing();
		
		super.draw();		// Code before this will be treated as before advice. And code after this will be treated as after advice.
		
		//After advice
		aspect.wish();
	}
}
