package com.soni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soni.model.UserDetail;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showDetail(@ModelAttribute(value="userDetail") UserDetail userDetail) { 
		// Here userDetail is not found, So a new instance of UserDetail is created and stored in model.
		userDetail.setUsername("Abhi");
		return "showDetails.def";
	}
	
}
