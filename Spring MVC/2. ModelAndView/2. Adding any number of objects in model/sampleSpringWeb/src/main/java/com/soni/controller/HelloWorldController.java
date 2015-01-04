package com.soni.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	public ModelAndView helloWorld() {
		
		List<String> skills = new ArrayList<String>();
		skills.add("Spring");
		skills.add("Struts");
		skills.add("Hibernate");
		skills.add("Maven");
		
		Map<String, Object> modelObjects = new HashMap<String, Object>();
		modelObjects.put("message", "Hello Folk");
		modelObjects.put("name", "Suyash");
		modelObjects.put("age", 21);
		modelObjects.put("skills", skills);
		
		ModelAndView mav = new ModelAndView("hello.def", modelObjects);
		
		return mav;
	}
	
	/*********** OR ************/
	
	/*@RequestMapping("/")
	public ModelAndView helloWorld() {
		ModelAndView mav = new ModelAndView();
		
		List<String> skills = new ArrayList<String>();
		skills.add("Spring");
		skills.add("Struts");
		skills.add("Hibernate");
		skills.add("Maven");
		
		Map<String, Object> modelObjects = new HashMap<String, Object>();
		modelObjects.put("message", "Hello Folk");
		modelObjects.put("name", "Suyash");
		modelObjects.put("age", 21);
		modelObjects.put("skills", skills);
		
		// Setting the model object map
		mav.addAllObjects(modelObjects);
		
		// Setting view name
		mav.setViewName("hello.def");
		
		return mav;
	}*/
	
	/*********** OR ************/
	
/*	@RequestMapping("/")
	public ModelAndView helloWorld() {
		ModelAndView mav = new ModelAndView();
		
		List<String> skills = new ArrayList<String>();
		skills.add("Spring");
		skills.add("Struts");
		skills.add("Hibernate");
		skills.add("Maven");
		
		// Setting model objects
		mav.addObject("message", "Hello User");
		mav.addObject("name", "Suyash");
		mav.addObject("age", 21);
		mav.addObject("skills", skills);
		
		// Setting view name
		mav.setViewName("hello.def");
		
		return mav;
	}*/
}
