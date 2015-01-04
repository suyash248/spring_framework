package com.soni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soni.model.UserDetail;

@Controller
public class HelloWorldController {
	
	@InitBinder
	public void myInitBinder(WebDataBinder binder){
		binder.setDisallowedFields("phone");	// We don't want spring to bind 'phone' field.
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginForm(){
		return "loginForm.def";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String showDetail(@ModelAttribute(value="userDetail") UserDetail userDetail) { 
		return "showDetails.def";
	}
	
}
