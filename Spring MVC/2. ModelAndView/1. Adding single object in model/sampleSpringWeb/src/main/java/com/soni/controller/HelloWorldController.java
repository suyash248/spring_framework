package com.soni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/")
	public ModelAndView helloWorld() {
		String message = "Hello Spring MVC";
		return new ModelAndView("hello.def", "message", message);
	}
}
