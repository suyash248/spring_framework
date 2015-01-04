package com.soni.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	public String helloWorld(ModelMap modelMap) { 
		List<String> skills = new ArrayList<String>();
		skills.add("Spring");
		skills.add("Struts");
		skills.add("Hibernate");
		skills.add("Maven");
		
		Map<String, Object> attributeMap = new HashMap<String, Object>();
		
		attributeMap.put("message", "Spring MVC ModelMap");
		attributeMap.put("name", "Suyash");
		attributeMap.put("age", 21);
		attributeMap.put("skills", skills);
		
		modelMap.addAllAttributes(attributeMap);
		
		return "hello.def";
	}
	
	/*********** OR ************/
	
/*	@RequestMapping("/")
	public String helloWorld(ModelMap modelMap) { 
		List<String> skills = new ArrayList<String>();
		skills.add("Spring");
		skills.add("Struts");
		skills.add("Hibernate");
		skills.add("Maven");
		
		modelMap.addAttribute("message", "Hello Spring MVC");
		modelMap.addAttribute("name", "Suyash");
		modelMap.addAttribute("age", 21);
		modelMap.addAttribute("skills", skills);
		
		return "hello.def";
	}*/
}
