package com.soni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/{username}", method=RequestMethod.GET)
	public ModelAndView helloWorld(@PathVariable String username) { 
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", username);
		mav.setViewName("hello.def");
		return mav;
	}
	
	@RequestMapping("/")
	public String loginForm() {
		return "loginForm.def";
	}
	
}
