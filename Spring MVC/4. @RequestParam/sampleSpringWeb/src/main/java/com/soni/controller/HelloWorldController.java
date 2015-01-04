package com.soni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public ModelAndView helloWorld(@RequestParam(value="userName") String uname) { 
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", uname);
		mav.setViewName("hello.def");
		return mav;
	}
	
	@RequestMapping("/")
	public String loginForm() {
		return "loginForm.def";
	}
	
}
