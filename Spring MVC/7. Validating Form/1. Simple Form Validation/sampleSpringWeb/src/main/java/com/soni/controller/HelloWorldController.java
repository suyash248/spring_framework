package com.soni.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.soni.model.UserDetail;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/showDetails", method=RequestMethod.POST)
	public String helloWorld(@Valid UserDetail userDetail, BindingResult bindingResult) { 
		if(bindingResult.hasErrors()){
			return "loginForm.def";
		}
		return "showDetails.def";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginForm(Model model) {
		model.addAttribute("userDetail", new UserDetail());
		return "loginForm.def";
	}
	
}
