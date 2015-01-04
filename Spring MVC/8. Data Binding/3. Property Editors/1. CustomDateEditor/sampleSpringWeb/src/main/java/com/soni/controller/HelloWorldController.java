package com.soni.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.soni.model.UserDetail;

@Controller
public class HelloWorldController {
	
	@InitBinder
	public void myInitBinder(WebDataBinder binder){
		SimpleDateFormat customFormat = new SimpleDateFormat("dd-mm-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(customFormat, false));
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginForm(Model model){
		model.addAttribute("userDetail", new UserDetail());
		return "loginForm.def";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String showDetail(@Valid @ModelAttribute(value="userDetail") UserDetail userDetail, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();
		if(bindingResult.hasErrors()){
			return "loginForm.def";
		}
		return "showDetails.def";
	}
	
}
