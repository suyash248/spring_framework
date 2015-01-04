package com.soni.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	public String helloWorld(Model model) { 
		List<String> skills = new ArrayList<String>();
		skills.add("Spring");
		skills.add("Struts");
		skills.add("Hibernate");
		skills.add("Maven");
		
		model.addAttribute("message", "Hello MVC");
		model.addAttribute("name", "Suyash");
		model.addAttribute("age", 21);
		model.addAttribute("skills", skills);
		
		return "hello.def";
	}
	
	/*********** OR ************/
	
/*	@RequestMapping("/")
	public String helloWorld(Model model) { 
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
				
		model.addAllAttributes(modelObjects);
		
		return "hello.def";
	}*/
}
